### Item 7 - Eliminate obsolete object references

對garbage collected語言來說, memory leak是一種淺在的危害, 每個地方都累積一點點垃圾, 到時候就會變成垃圾山.
如果一個物件的參照在無意中被保留下來了, 除了這個被保留的物件之外, 其有參照到的任何物件也都會被gc排除在外.
所以, 當物件管理自己的memory時, 其就有必要將不必要的參照null out.

範例:
1. stack的pop過程中產生的memory leak
    1. 解法: nulling out object (把不必要的物件參照設為null)
    2. 把物件參照設為null應該視為一種例外, 而非標準.
    3. GC不會知道這個stack的elements array裡的哪些部分是valid, 哪些是要被回收的, 這些只有developer知道, 所以應該由developer來告知GC這件事情.
2. Cache也是一種常見的memory leak
    1. 很多時候, 我們可能會把某些東西cache下來然後就這樣放在那邊然後忘記它的存在, 儘管其已經過期了.
    2. 解法: 可以用WeakHashMap作為cache的資料結構, 其特性是當外界沒有物件參照至此cache中的某個key時, cache中該key的entry就會自動被移除.
3. Listener與callback也是一種memory leak
    1. 若client只知道register callback但卻不會顯式地去deregister, 就會一直累積直到你採取某些手段為止.


額外範例: 物件自救

* Source code: [Click me](https://github.com/yotsuba1022/java-concurrency/blob/master/src/main/java/idv/java/jvm/gc/escape/FinalizeEscapeGC.java)

* Read more: [Click me](https://yotsuba1022.gitbooks.io/about-java-memory-model-jmm-a-k-a-jsr-133/content/chapter-3-4-gc-basics.html)

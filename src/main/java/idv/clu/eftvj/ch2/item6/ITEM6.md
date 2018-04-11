### Item 6 - Avoid creating unnecessary objects

* 不要建立沒必要的物件

  例子:
  1. 善用String pool … 不要new一堆String
  2. Regular expression的Pattern物件(compile reg expression成有限狀態機的代價)
  3. Map的keySet()方法 … Set的一個view, 無論呼叫該方法多少次.
  4. 可以primitive就不要autoboxing
  5. 除非必要, 否則不要嘗試自己維護object pool, 譬如說db connection這種比較珍貴且需要重用的資源再試著自己維護.

  若真的需要重用某些建立代價高的物件, 可以考慮cache它們以利重用.

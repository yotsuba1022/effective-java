### Item 8 - Avoid finalizers and cleaners

* Java developer通常都會以try-finally來達成一些資源回收的動作,
  但是, 沒有任何保證提及finalizers會被準時(及時)執行(JLS,12.6).
  當在finalizer進行一些跟時間有絕對關連的任務, 比如說像是檔案的關閉. 如果finalizer沒有及時關閉, 這樣子如果有下一個程式來存取檔案就會發生錯誤了.

* 若你的物件封裝了一些像是檔案, 執行緒之類的資源, 然後又需要關閉它們的話, 有沒有什麼辦法可以用來替代撰寫finalizer或是cleaner呢?
  其實, 只要讓你的class實作AutoCloseable介面即可. 當這些實作AutoCloseable的物件不被需要的時候,
  再讓使用該instance的client呼叫close()方法即可. 當然, 若能使用try-with-resource會更好.
  另外有一點值得一提的是: 這些instance必須紀錄其自身是否被close了 --- close方法必須在一個field上記錄著此物件是否為valid,
  而其它方法必須透過確認此field中記載的狀態來決定是否要拋出IllegalStateException(當此instance已經被close的時候).

  那cleaner/finalizer到底有什麼好處呢? 可能有以下兩種:

  1. 作為資源持有者忽略釋放資源時的安全網(safety net)
  2. 當物件持有native peers時, 可以使用cleaner (native object 指的是 java 以外的語言產生的 object, 像是call c/c++ native function create 的 objects)


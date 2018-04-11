### Item 5 - Prefer dependency injection to hard wiring resources

* 若一個class會受到外在相依資源的影響的話, 切記不要使用singleton或是靜態工具類別的方式來實作,
  而對於這些相依資源的取得, 也不應該採用較直接的方式(如new關鍵字),
  而是應該透過由外部傳進當前class之constructor的方式來獲得(constructor injection)

* DI對於測試上其實也提供了一定程度上的便利性, 並且讓你的程式更好進行測試.

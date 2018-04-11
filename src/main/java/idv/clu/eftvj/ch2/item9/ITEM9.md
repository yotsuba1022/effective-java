### Item 9 - Prefer try-with-resources to try-finally

* 當使用到一些必須關閉的資源時, 總是使用try-with-resources, 而不是使用try-finally. 因為這樣可以讓程式更簡短易讀, 且其中產生的exception對於診斷問題也會更有用.


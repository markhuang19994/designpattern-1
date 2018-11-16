## 鐵人賽中文章的source code

### 前言

------

我目前是android工程師
中途轉職開發軟體有一年左右的時間
雖然工作了也不算短的時間
不過很多時候是找google複製貼上別人的code
或是找現有的庫來滿足需求
看到在github上各種專案
很羨慕大家能夠互相交流
希望未來有一天能夠在上面也貢獻自己的程式碼

> 但是這有一些前提的知識點需要了解...

例如：

1. Version Control System
   - git
   - git flow
   - github flow
2. Software Architecture
   - clean code
   - clean architecture
   - `design pattern`

如果不了解上面各個知識點，在與別人合作的過程中一定困難重重...
除了這些根據你想貢獻的issue和專案還有更多的需要突破的難關
但是上面提到的兩點需要熟悉運用，才有基礎可以貢獻自己的程式碼！

> 希望在經過這30天的挑戰後能距離大神們更近一點

接下來規劃每天介紹一種設計模式
還有一些天數可以做一些補充又或許是更深入的解析

嘗試30天進入軟體設計之窗

### 什麼是設計模式

> 在[軟體工程](https://zh.wikipedia.org/wiki/%E8%BB%9F%E9%AB%94%E5%B7%A5%E7%A8%8B)中，**設計模式**（design pattern）是對[軟體設計](https://zh.wikipedia.org/wiki/%E8%BB%9F%E4%BB%B6%E8%A8%AD%E8%A8%88)中普遍存在（反覆出現）的各種問題，所提出的解決方案。這個術語是由[埃里希·伽瑪](https://zh.wikipedia.org/wiki/%E5%9F%83%E9%87%8C%E5%B8%8C%C2%B7%E4%BC%BD%E7%91%AA)（Erich Gamma）等人在1990年代從[建築設計](https://zh.wikipedia.org/wiki/%E5%BB%BA%E7%AD%91%E8%AE%BE%E8%AE%A1)領域引入到[電腦科學](https://zh.wikipedia.org/wiki/%E8%A8%88%E7%AE%97%E6%A9%9F%E7%A7%91%E5%AD%B8)的。
>
> 設計模式並不直接用來完成[程式碼](https://zh.wikipedia.org/wiki/%E7%A8%8B%E5%BC%8F%E7%A2%BC)的編寫，而是描述在各種不同情況下，要怎麼解決問題的一種方案。[物件導向](https://zh.wikipedia.org/wiki/%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%A8%8B%E5%BA%8F%E8%AE%BE%E8%AE%A1)設計模式通常以[類別](https://zh.wikipedia.org/wiki/%E7%B1%BB_(%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%A7%91%E5%AD%A6))或[物件](https://zh.wikipedia.org/wiki/%E7%89%A9%E4%BB%B6_(%E9%9B%BB%E8%85%A6%E7%A7%91%E5%AD%B8))來描述其中的關係和相互作用，但不涉及用來完成應用程式的特定類別或物件。設計模式能使不穩定依賴於相對穩定、具體依賴於相對抽象，避免會引起麻煩的緊耦合，以增強軟體設計面對並適應變化的能力。
>
> 並非所有的軟體模式都是設計模式，設計模式特指軟體「設計」層次上的問題。還有其他非設計模式的模式，如[架構模式](https://zh.wikipedia.org/w/index.php?title=%E6%9E%B6%E6%A7%8B%E6%A8%A1%E5%BC%8F&action=edit&redlink=1)。同時，[演算法](https://zh.wikipedia.org/wiki/%E6%BC%94%E7%AE%97%E6%B3%95)不能算是一種設計模式，因為演算法主要是用來解決計算上的問題，而非設計上的問題。
>
> *-- [by wikipedia 設計模式 (電腦)](https://zh.wikipedia.org/wiki/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F_(%E8%AE%A1%E7%AE%97%E6%9C%BA))*

上面這段文章摘錄是wikipedia對於設計模式的說明。

接下來的30天會針對設計模式做各個pattern的介紹和實作，分享自己有關於設計模式的理解，並且期望在熟悉之後對於整個軟體設計的過程，和程式碼的邏輯有一個通盤性的了解，期望未來在接觸到相似的軟體架構或是程式碼時，可以快速的理解別人編寫程式碼的概念。

除了閱讀別人的程式碼、函式庫外，期望未來在軟體設計上，有一個可以依據的程式架構概念，讓自己所撰寫的程式碼容易閱讀，並且可以簡單的修改擴充，另外對於軟體架構上有更近一步的理解，而一步一步的提升自己抽象化程式碼的能力，也就是提升自己對於程式設計、系統設計、架構設計的觀念，和程式思維的訓練。

### 文章摘錄

其中各個模式的實作會以Java來實現。

設計模式一共分為下面三種：

#### 建立型模式

- [[ Day 2 ] 初探設計模式 - 工廠方法模式 (Factory Method Pattern)](https://ithelp.ithome.com.tw/articles/10202075)
- [[ Day 5 ] 初探設計模式 - 單例模式 (Singleton)](https://ithelp.ithome.com.tw/articles/10203092)
- [[ Day 10 ] 隨著自己想要的客製化 - 建造者模式 ( Builder Pattern)](https://ithelp.ithome.com.tw/articles/10204732)
- [[ Day 14 ] 設定一次一勞永逸～原形模式 ( Prototype Pattern )](https://ithelp.ithome.com.tw/articles/10205989)
- [[ Day 26 ] 做好自己會做的就好啦 ～抽象工廠模式 ( Abstract Factory )](https://ithelp.ithome.com.tw/articles/10208955)
- [[ Day 27 ] 初探設計模式 - 建立型模式](https://ithelp.ithome.com.tw/articles/10209153)

#### 結構型模式

- [[ Day 7 ] 初探設計模式 - 裝飾模式(Decorator)](https://ithelp.ithome.com.tw/articles/10203738)
- [[ Day 12 ] 隨心所欲地重用不相容的類別～ - 轉接器模式 ( Adapter Pattern )](https://ithelp.ithome.com.tw/articles/10205321)
- [[ Day 13 ] 自己不會沒關係～找一個代理人幫忙處理 - 代理模式 ( Proxy Pattern )](https://ithelp.ithome.com.tw/articles/10205659)
- [[ Day 15 ] 整理出漂亮的介面 - 外觀模式 ( Facade Pattern )](https://ithelp.ithome.com.tw/articles/10206318)
- [[ Day 18 \] 共用程式碼和物件～享元模式 ( Flyweight Pattern )](https://ithelp.ithome.com.tw/articles/10207215)
- [[ Day 19 \] 一個是全部的部分～部分一個的集合 - 組合模式 ( Composite Pattern)](https://ithelp.ithome.com.tw/articles/10207478)
- [[ Day 21 ] 你的東西就是我的東西！ - 橋接模式 ( Bridge Pattern )](https://ithelp.ithome.com.tw/articles/10207956)
- [[ Day 28 ] 初探設計模式 - 結構型模式](https://ithelp.ithome.com.tw/articles/10209403)

#### 行為型模式

- [[ Day 3 ] 初探設計模式 - 策略模式 (Strategy Pattern)](https://ithelp.ithome.com.tw/articles/10202506)[[ Day 8 ] 初探設計模式 - 觀察者模式 ( Observer Pattern )](https://ithelp.ithome.com.tw/articles/10204117)
- [[ Day 9 ] 初探設計模式 - 命令模式 ( Command Pattern )](https://ithelp.ithome.com.tw/articles/10204425)
- [[ Day 11 ] 老闆這這樣說～你照著做就對了 - 範本方法模式 ( TemplateMethod Pattern )](https://ithelp.ithome.com.tw/articles/10205036)
- [[ Day 16 ] 根據想要的(?)狀況自由選擇 - 狀態模式 ( State Pattern )](https://ithelp.ithome.com.tw/articles/10206608)
- [[ Day 17 ] 簡單的Undo和Redo - 備忘錄模式 ( Memoto Pattern )](https://ithelp.ithome.com.tw/articles/10206939)
- [[ Day 20 ] 這樣每個月發薪水就輕鬆啦！迭代器模式 ( Iterator Pattern )](https://ithelp.ithome.com.tw/articles/10207704)
- [[ Day 22 ] 這件事誰能作主！ - 責任鍊模式 ( Chain of Responsibility Pattern )](https://ithelp.ithome.com.tw/articles/10208172)
- [[ Day 23 ] 幫我跟那個誰喬一下 - 仲介者模式 ( Mediator Pattern )](https://ithelp.ithome.com.tw/articles/10208389)
- [[ Day 24 ] 解釋一下這是什麼意思··· - 解譯器模式 ( Interpreter Pattern)](https://ithelp.ithome.com.tw/articles/10208556)
- [[ Day 25 ] 每個人關心的點都不同 - 訪問者模式 (Visitor Pattern)](https://ithelp.ithome.com.tw/articles/10208766)
- [[ Day 29 ] 初談設計模式 - 行為型模式(1)](https://ithelp.ithome.com.tw/articles/10209510)
- [[ Day 30 ] 初探設計模式 - 行為型模式(2) & 完賽感言](https://ithelp.ithome.com.tw/articles/10209695)

#### 雜談

另外這30天內沒辦法被分類的文章

- [[ Day 1 ] 我為什麼想學設計模式 ( Design Pattern )](https://ithelp.ithome.com.tw/articles/10201706)
- [[ Day 4 ] 初探設計模式 - 關於那些更基本的事情...系統架構(System Architecture)](https://ithelp.ithome.com.tw/articles/10202864)
- [[ Day 6 ] 初探設計模式 - 深入工廠、策略與單例模式](https://ithelp.ithome.com.tw/articles/10203503)
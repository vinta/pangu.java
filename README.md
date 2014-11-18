Pangu.java
==========

Paranoid text spacing for good readability, to automatically insert whitespace between CJK (Chinese, Japanese, Korean), half-width English, digit and symbol characters.

* JavaScript version: [pangu.js](https://github.com/vinta/paranoid-auto-spacing/blob/master/src/pangu.js)
* Node.js version: [pangu.node](https://github.com/huei90/pangu.node)
* Python version: [pangu.py](https://github.com/vinta/pangu.py)
* Java version: [pangu.java](https://github.com/vinta/pangu.java)

Usage
=====

``` java
import ws.vinta.pangu.Pangu;

Pangu pangu = new Pangu();

// newText will be "請問 Jackie 的鼻子有幾個？123 個！"
String newText = pangu.spacingText("請問Jackie的鼻子有幾個？123個！");
```

Run Tests
=========

``` bash
$ mvn test
```

Pangu.java
==========

[![Build Status](http://img.shields.io/travis/vinta/pangu.java/master.svg?style=flat-square)](https://travis-ci.org/vinta/pangu.java)

Paranoid text spacing for good readability, to automatically insert whitespace between CJK (Chinese, Japanese, Korean), half-width English, digit and symbol characters.

* JavaScript version: [pangu.js](https://github.com/vinta/paranoid-auto-spacing/blob/master/src/pangu.js)
* Node.js version: [pangu.node](https://github.com/huei90/pangu.node)
* Python version: [pangu.py](https://github.com/vinta/pangu.py)
* Java version: [pangu.java](https://github.com/vinta/pangu.java)

## Download

Download [the latest JAR](https://search.maven.org/remote_content?g=ws.vinta&a=pangu&v=LATEST) or grab via Maven:

``` xml
<dependency>
  <groupId>ws.vinta</groupId>
  <artifactId>pangu</artifactId>
  <version>1.1.0</version>
</dependency>
```

or Gradle:

``` groovy
compile 'ws.vinta:pangu:1.1.0'
```

## Usage

``` java
import ws.vinta.pangu.Pangu;

public class Main {
    public static void main(String[] args) {
        Pangu pangu = new Pangu();
        String newText = pangu.spacingText("請問Jackie的鼻子有幾個？123個！");
        System.out.println(newText); // will be "請問 Jackie 的鼻子有幾個？123 個！"
    }
}
```

## Run Tests

``` bash
$ mvn test
```

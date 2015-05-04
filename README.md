Pangu.java
==========

[![Build Status](http://img.shields.io/travis/vinta/pangu.java/master.svg?style=flat-square)](https://travis-ci.org/vinta/pangu.java)

Paranoid text spacing for good readability, to automatically insert whitespace between CJK (Chinese, Japanese, Korean), half-width English, digit and symbol characters.

* Go version: [pangu.go](https://github.com/vinta/pangu)
* Java version: [pangu.java](https://github.com/vinta/pangu.java)
* JavaScript version: [pangu.js](https://github.com/vinta/paranoid-auto-spacing)
* Node.js version: [pangu.node](https://github.com/huei90/pangu.node)
* Python version: [pangu.py](https://github.com/vinta/pangu.py)
* Ruby version: [pangu.rb](https://github.com/dlackty/pangu.rb)

## Download

Download [the latest JAR](https://search.maven.org/remote_content?g=ws.vinta&a=pangu&v=LATEST) or grab via [Maven](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22ws.vinta%22%20AND%20a%3A%22pangu%22):

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

Pangu.java
==========

[![](https://img.shields.io/badge/made%20with-%e2%9d%a4-ff69b4.svg?style=flat-square)](https://vinta.ws/code/)

Paranoid text spacing for good readability, to automatically insert whitespace between CJK (Chinese, Japanese, Korean), half-width English, digit and symbol characters.

- [pangu.go](https://github.com/vinta/pangu) (Go)
- [pangu.java](https://github.com/vinta/pangu.java) (Java)
- [pangu.js](https://github.com/vinta/pangu.js) (JavaScript)
- [pangu.py](https://github.com/vinta/pangu.py) (Python)
- [pangu.space](https://github.com/vinta/pangu.space) (Web API)

## Download

Download [the latest JAR](https://search.maven.org/remote_content?g=ws.vinta&a=pangu&v=LATEST) or grab via [Maven](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22ws.vinta%22%20AND%20a%3A%22pangu%22):

```xml
<dependency>
  <groupId>ws.vinta</groupId>
  <artifactId>pangu</artifactId>
  <version>1.1.0</version>
</dependency>
```

or Gradle:

```groovy
compile 'ws.vinta:pangu:1.1.0'
```

## Usage

```java
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

```console
$ mvn test
```

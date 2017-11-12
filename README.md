# CharsetDetectorSample
Groovy で、文字コードを自動的に判別してファイルを読み込むサンプルです。
ICU4J を使用して、文字コードを意識すること無くファイルの内容を読み込んで表示します。

## 使い方
```bash
groovy icu4j.groovy
```

UTF-8 で改行が LF のファイルと、SJIS で改行が CRLF のファイルを読み込んで表示します。

## 使用しているライブラリ等
- [ICU - International Components for Unicode](http://site.icu-project.org/)

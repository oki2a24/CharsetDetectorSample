// https://mvnrepository.com/artifact/com.ibm.icu/icu4j
@Grapes(
    @Grab(group='com.ibm.icu', module='icu4j', version='60.1')
)

import com.ibm.icu.text.CharsetDetector
import com.ibm.icu.text.CharsetMatch

void detectCharaset(String path) {
    def bytes = new File(path).getBytes()
    CharsetMatch cm = new CharsetDetector().setText(bytes).detect()
    println "${path} の文字コードは ${cm.getConfidence()} % の確率で ${cm.getName()}"
}

void readFile(String path) {
    def bytes = new File(path).getBytes()
    Reader reader = new CharsetDetector().setText(bytes).detect().getReader()
    reader.eachLine {
        println it
    }
}

println "★UTF-8 で LF のファイルを読込み"
detectCharaset("./utf8.txt")
readFile("./utf8.txt")
println ""
println "★SHIFT_JIS で CRLF のファイルを読込み"
detectCharaset("./sjis.txt")
readFile("./sjis.txt")
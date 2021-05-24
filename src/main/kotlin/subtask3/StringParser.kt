package subtask3

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.lang.StringBuilder

class StringParser {
    fun getResult(inputString: String): Array<String> {

        if(inputString == null) return inputString

    var array = ArrayList<String>()
    var posArray = 0
    var tempOpenSymbol:Char
    var posOpenSymbol = -1
    var posCloseSymbol = -1
    var posRepetSymbol = -1

    while(posArray != inputString.length) {
        if(inputString[posArray] == '<' || inputString[posArray] == '[' || inputString[posArray] == '(') {
            tempOpenSymbol = inputString[posArray]
            posOpenSymbol = ++posArray
            while (inputString[posArray] != when (tempOpenSymbol) {
                    '<' -> '>'
                    '[' -> ']'
                    '(' -> ')'
                    else -> "" } || posRepetSymbol >= 0) {
                if(inputString[posArray] == tempOpenSymbol)
                    posRepetSymbol ++
                if(inputString[posArray] == when (tempOpenSymbol) {
                        '<' -> '>'
                        '[' -> ']'
                        '(' -> ')'
                        else -> "" } )
                    posRepetSymbol--
                posArray++
            }
            posCloseSymbol=posArray
            array.add(inputString.substring(posOpenSymbol, posCloseSymbol))
            posArray=posOpenSymbol
        }
        else
            posArray++
    }
        return array.toTypedArray()
    }
}

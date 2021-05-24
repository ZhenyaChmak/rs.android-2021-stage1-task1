package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        if(sadArray.isEmpty()) {
            return sadArray
        }

        var tmp = sadArray
        while(!inHappy(tmp))
            tmp = outHappy(tmp)
        return tmp
    }

    private fun inHappy(inArray:IntArray):Boolean{
        for(i in 1..inArray.size-2){
            if(inArray[i]>inArray[i-1]+inArray[i+1])
                return false
        }
        return true
    }

    private fun outHappy(array: IntArray):IntArray{
        var temp = IntArray(array.size)
        temp[0]=array[0]
        var index = 0
        for(i in 1..array.size-2){
            if(array[i]>array[i-1]+array[i+1])
                index++
            else
                temp[i-index]=array[i]
        }
        temp[array.size-index-1] = array[array.size-1]
        return (temp.filter { it>0 }).toIntArray()
    }
}

package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        return if((bill.sum()-bill[k])/2 == b)
            "bon appetit"
        else
            (b-(bill.sum()-bill[k])/2).toString()
    }
}

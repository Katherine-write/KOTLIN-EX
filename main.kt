fun main() {
    val amount = 10_000
    val fee = amount / 100 * 0.75
    val minFee = 35

    val result = if(fee > minFee) fee else minFee

    println(result)
}
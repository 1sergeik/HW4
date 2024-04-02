

fun main() {
    val totalPurchasePrice:Int = totalPurchasePriceF()
    val regularClient:Boolean = regularClientF()
    calculationOfPrice(totalPurchasePrice,regularClient)
}
fun totalPurchasePriceF():Int {
    println("Enter total purchase price:")
    val totalPurchasePriceEnter:Int = readln().toInt()
    if (0<totalPurchasePriceEnter)    return (totalPurchasePriceEnter.toInt())
    else println("You didn't enter total purchase price. Please start program again.")
    return 0
}
fun regularClientF():Boolean{
    println("if it's a regular Client, please enter Y, or press key Enter")
    val regularClientEnter:String = readln()
    if (regularClientEnter=="Y") return true
    else if (regularClientEnter=="y") return true
    else return false
}
fun calculationOfPrice(priceRaw:Int,regCl:Boolean){
    var priceCliar:Int = priceRaw
    if (priceRaw in 0.. 1000) {priceCliar = priceRaw
    } else if (priceRaw in 1001..10000 ) {
        if (regCl == true) {priceCliar = (priceRaw -100 - (priceRaw * .01).toInt())}
        else priceCliar -= 100
    } else {
        if (regCl == true) {priceCliar = ((priceRaw*.95).toInt() - (priceRaw*.01).toInt())}
        else priceCliar = (priceRaw*.95).toInt()
    }
    println("Price with discount is: $priceCliar")
}

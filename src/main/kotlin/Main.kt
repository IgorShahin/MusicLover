fun main() {
    val musicLover = true
    var amountTransfer = 1523
    val discount = 0.05
    val discountML = 0.01

    println("Сумма покупки составляет -> ${amountTransfer}₽\n")

    if (amountTransfer in 1001..10_000) {
        amountTransfer -= 100
        println("[!] Вы получили скидку 100₽")
        if (musicLover) {
            amountTransfer -= (amountTransfer * discountML).toInt()
            println("[!] Вы получили скидку 1%(меломан)")
        }
        println("Цена покупки изменилась -> ${amountTransfer}₽")

    } else if (amountTransfer > 10_000) {
        amountTransfer -= (amountTransfer * discount).toInt()
        println("[!] Вы получили скидку 5%")
        if (musicLover) {
            amountTransfer -= (amountTransfer * discountML).toInt()
            println("[!] Вы получили скидку 1%(меломан)")
        }
        println("Цена покупки изменилась -> ${amountTransfer}₽")
    } else if (musicLover) {
        amountTransfer -= (amountTransfer * discountML).toInt()
        println(
            "[!] Вы получили скидку 1%(меломан) \n" +
                    "Цена покупки изменилась -> ${amountTransfer}₽"
        )
    }
}
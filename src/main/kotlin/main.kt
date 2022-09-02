import kotlin.random.Random

fun main() {
    //Ex 1
    println("Задание 1")
    val min1: Int = 3500 //минимальная сумма перевода 3500 копеек
    val discount = 0.75f //комиссия с перевода
    println("Введите сумму перевода (от 35 рублей): ")
    var amount1: Int
    while (true) {
        amount1 = Integer.valueOf(readLine())
        if (amount1*100 > min1) break else println("Недопустипая сумма")
    }
    println("""Ваша сумма: ${amount1} рублей
        | Комиссия: ${(amount1*discount).toInt()} копеек
        | К переводу: ${(amount1*100-amount1*discount)/100} рублей
    """.trimMargin())
    println()



    //Ex 2
    println("Задание 2")
    println("Введите число лайков: ")
    val likes = Integer.valueOf(readLine()) //количество лайков
    if (((likes % 100 != 11) && (likes % 10 == 1)) || (likes == 1)) println("Понравилось $likes человеку") else println("Понравилось $likes людям")
    println()



    //Ex 3
    println("Задание 3")
    val itemPrice: Int = 100 //стоимость одного трека
    println("Сколько треков вы хотите купить? ")
    val itemCount = Integer.valueOf(readLine()) //кол-во треков
    val discount1: Int = 100 //100 рублей скидка
    val discount1Start: Int = 1000 //от куда начинается скидка 1
    val discount2 = 0.05f //5% скидка
    val discount2Start: Int = 10000 //от куда начинается скидка 2
    val discount3 = 0.01f //скидка постоянного покупателя
    var isBuyOften: Boolean = (Random.nextInt(0, 2) == 1); //часто ли человек покупает
    val amount: Int = itemPrice*itemCount //Сумма без скидок
    var final: Int //Итоговая сумма

    println("""Стоимость одного трека $itemPrice рублей
        |Вы заказываете $itemCount единицы
        |Сумма $amount рублей
    """.trimMargin())

    if (amount > 10000) {
        final = (amount*(1-discount2)).toInt()
        println("Для вас действует скидка ${discount2*100} %")
    } else if (amount > 1000) {
        final = amount - discount1
        println("Для вас действует скидка $discount1 рублей")
    } else final = amount

    if (isBuyOften) {
        final = (final*(1-discount3)).toInt()
        println("Действует скидка постоянного покупателя ${discount3*100} %")
    }

    println("Итого к оплате: $final")
}
fun main(args: Array<String>) {

    var UnknownNumber = (0 .. 100).random()
    println("\"ЗАДАЧА: Угадать число (от 0 до 100).\"")

    var Count = 0
    var UserNumber = 0

    val scan = java.util.Scanner(System.`in`)

    do{
        Count = Count + 1
        println("Введите ваше число:")
        UserNumber = scan.nextInt()

        if (UserNumber > UnknownNumber) {
            println("Моё число меньше")
        } else if (UserNumber < UnknownNumber) {
            println("Моё число больше")
        } else {
            println("Вы угадали!")
        }


    }while(UnknownNumber != UserNumber)
    println("Количество попыток: $Count")
}
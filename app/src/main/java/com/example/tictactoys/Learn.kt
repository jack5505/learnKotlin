package com.example.tictactoys


fun sum(a: Int, b: Int): Int{
    return a + b
}

fun main(){
    println("hello world")
    fun sum(a: Int, b: Int) = a + b
    println(sum(3,1))

    fun printSum(a: Int, b: Int){
        println("sum of $a and $b is ${a + b}")
    }

    printSum(3,1)
    val A: Int = 1
    val b = 3
    printSum(A,b)

    var test = Test(3*1.0,1*1.0)
    println("perimeter of this is ${test.perimeter}")

    open class Shape

    class rectangle(var Height: Double, var Length: Double){
        var Perimeter = (Height + Length)/2
    }

    var r = rectangle(3*1.0,3*1.0)
    println("perimeter of this class ${r.Perimeter}")

    class Conus (var str: String): Shape() {
        var name = str
    }


    var a = 1

    val str = "the is $a"

    val s2 = "${str.replace("is","was")}, but now is $a"

    println(s2)

    val items = listOf("Jack","here","change")
    for (i in items){
        println(i)
    }
    for (index in items.indices){
        println(index)
    }

    var index = 0
    while (index < items.size){
        println("salom dunyo $index and ${items[index]}")
        index++

    }


    fun describe(obj: Any):String =
        when(obj){
            1 -> "one"
            "hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not String"
            else -> "Unkown"
        }

    val x = 10
    val y = 9
    if (x in 1..y+1 ) {
        println("fits in range $x $y")
    }
    val startZ = 4
    val startY = 3
    for (startZ in 1..startY+1){
        println("$startZ $startY")
    }


    for (x in 10 downTo 0 step 2){
        println(x)
    }


}
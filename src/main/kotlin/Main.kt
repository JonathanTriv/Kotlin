import javafx.beans.binding.When
import java.text.DecimalFormat
import java.util.Scanner
import kotlin.math.ceil
import kotlin.math.floor

fun main() {

    /*

    println("Hola kotlin")

    var num = 5
    var nota = 3.5
    var nombre = "Pedro"
    var num2:Int = 6

    val pi = 3.141516
    val fecha = "15-08-2023"

    var suma = num + num2
    var resta = num - num2
    var multiplicacion = num * num2
    var division = num / num2


    println("""
        SUMA : $suma
        RESTA : $resta
        MULTIPLICACION : $multiplicacion
        DIVISION : $division
        
    """.trimIndent())

    var num1 = "5"

    var total = num1.toInt() * suma

    println("LA SUMA TOTAL ES: $total " )

    println("INGRESE LA BASE")

    var base = readln().toDouble()

    println("INGRESE LA ALTURA")

    var altura = readln().toDouble()

    var area = (base * altura) / 2

    println("""
        BASE: $base
        ALTURA: $altura
        AREA DEL TRIANGULO: $area
    """.trimIndent())

    var raiz = Math.sqrt(area)

    println("LA RAIZ ES : $raiz")

    println(DecimalFormat("#.###").format(raiz))

    println(floor(raiz).toInt())

    println(ceil(raiz).toInt())

    println("INGRESE SU EDAD: ")

    var edad:Int = readln().toInt()

    if (edad >= 18){
        println("ES MAYOR EDAD")
    }else{
        println("ES MENOR EDAD")
    }

    var numero = 3

    when(numero){
        1,2 -> println("NO ES IGUAL")
        3 -> println("ES IGUAL")
        else -> println("NUMERO NO ENCONTRADO")
    }




    for (i in 1..100){
        println(i)
    }
    for (j in 100 downTo 1 step 2) {
        println(j)
    }
    */
/*
    var z = 1
    while (z <= 100){
        println(z)
        z++
    }

    var f = 100
    do {
        println(f)
        f--
    }while (f >= 1)*/

/*    var estudiantes = arrayOf("Lorena", "Pedro", "Luis")

    println(estudiantes[1])
    println(estudiantes.size)

    var numeros = intArrayOf(12,45,67,19)

    for (i in 0 until numeros.size){
        println(numeros[i])
    }*/

    var milista = arrayListOf("Pepe",20,30)

    var suma = milista[1] as Int + milista[2] as Int
    var nombre = milista[0] as String  + milista[1]




       milista.forEachIndexed(){i, est ->
           println("$i - $est")
    }








}
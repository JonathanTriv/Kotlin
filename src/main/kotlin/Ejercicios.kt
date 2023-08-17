import java.text.DecimalFormat
import java.util.*
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main() {
    do {
        println("MENU")
        println("1. Direccion")
        println("2. Salario")
        println("3. Circulo")
        println("4. Transporte")
        println("5. Salir")
        println("Digita una Opcion")
        var opcion = readln().toInt()

        when (opcion){
            1 -> {
                println("TU DIRECCION")
                println("Digita el nombre de tu calle: ")
                var calle = readln()
                println("Digita la ciudad: ")
                var ciudad = readln()
                println("Digita el estado: ")
                var estado = readln()
                println("Digita el pais: ")
                var pais = readln()
                println("Digita el codigo postal: ")
                var codigoPos = readln().toInt()

                println("CALLE: $calle, CIUDAD: $ciudad, ESTADO: $estado, PAIS: $pais, CODIGO POSTAL: $codigoPos ")
            }
            2 ->{

                println("SALARIO")
                println("Digita tu salario en bruto: ")
                var salario = readln().toDouble()
                println("Digita el porcentaje de impuestos que pagas por mes: ")
                var porImpuestos = readln().toDouble() / 100

                var impuestosMes = salario * porImpuestos
                var salarioNetoMes = salario - impuestosMes

                var impuestosAño = impuestosMes * 12
                var salarioNetoAño = salarioNetoMes * 12

                println("""
                Salario neto al mes: " ${DecimalFormat("#.##").format(salarioNetoMes)} 
                Salario neto al año: " ${DecimalFormat("#.##").format(salarioNetoAño)}
                Impuestos al mes: " ${DecimalFormat("#.##").format(impuestosMes)}
                Impuestos al año: " ${DecimalFormat("#.##").format(impuestosAño)}
            """.trimIndent())


            }

            3 -> {

                println("CIRCULO")

                println("Digita el radio del circulo: ")
                var radio = readln().toDouble()

                fun area(): Double {

                    return Math.PI * Math.pow(radio, 2.0)
                }

                fun circunferencia(): Double {

                    return 2 * Math.PI * radio
                }

                var areaPul = area() / 2.54
                var circunferenciaPul = circunferencia() / 2.54

                println("""
                EL AREA CM: " ${DecimalFormat("#.##").format(area())}
                LA CIRCUNFERENCIA CM: " ${DecimalFormat("#.##").format(circunferencia())}
                EL AREA PUL: " ${DecimalFormat("#.##").format(area()/2.54)}
                LA CIRCUNFERENCIA PUL: " ${DecimalFormat("#.##").format(circunferencia()/2.54)}

            """.trimIndent())
            }

            4 -> {
                println("TRANPORTE")
                println("Ingrese los kilomestros del trayecto: ")
                var km = readln().toDouble()
                println("""
                    Aplicar descuento? 
                    Digita 1 o Si para aplicarlo:  
                """.trimIndent())
                var descuento = readln().uppercase(Locale.getDefault())

                var totalKm = km * 2.25

                if (descuento == "1" || descuento == "SI"){
                    totalKm *= 0.45
                    println("El precio del trayecto con el descurnto es de $${totalKm.roundToInt()}")
                }else{
                    println("El precio total del trayecto es de $${totalKm.roundToInt()}")
                }

            }
            5-> exitProcess(0)
            else-> println("Opcion no Valida")

        }
        println("Presiona Enter para continuar...")
        readLine()


    }while (opcion <= 5)

}
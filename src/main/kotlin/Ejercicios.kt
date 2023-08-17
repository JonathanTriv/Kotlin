fun main() {

    println("MENU")
    println("1. Direccion")
    println("2. Salario")
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

            println("Salario neto al mes: ${salarioNetoMes.toBigDecimal().setScale(2)} " +
                    "Salario neto al año:${salarioNetoAño.toBigDecimal().setScale(2)}, " +
                    "Impuestos al mes: ${impuestosMes.toBigDecimal().setScale(2)}, " +
                    "Impuestos al año: ${impuestosAño.toBigDecimal().setScale(2)} ")


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

            println("EL AREA EN CM : ${area()}" +
                    "LA CIRCUNFERENCIA EN CM: ${circunferencia()}" +
                    "EL AREA EN PUL : ${areaPul}" +
                    "LA CIRCUNFERENCIA EN PUL: ${circunferenciaPul}")
        }
    }





}
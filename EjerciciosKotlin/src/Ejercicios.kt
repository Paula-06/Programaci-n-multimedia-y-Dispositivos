/*
 * PMDM · UT2 · Ejercicios de Kotlin
 *
 * Reglas de entrega (importantes para la autocorrección):
 *  - Trabaja SOLO en este archivo. No cambies su nombre, no añadas `package` y no toques las firmas:
 *    cada ejercicio es una función sin parámetros llamada ejercicio01(), ejercicio02()… ejercicio24().
 *  - Lee los datos con readln() / readLine() (o Scanner) y muestra los resultados con println().
 *  - Puedes crear funciones auxiliares en este mismo archivo.
 *  - Mientras trabajas puedes comentar en main() las llamadas que aún no has hecho.
 *  - Sube tus cambios con git push (commit + push). Cada push se corrige automáticamente.
 *
 * Los ejercicios 25 a 28 son voluntarios (suman hasta 1 punto extra en la nota).
 */

fun main() {
    print("¿Qué ejercicio quieres ejecutar? (1-24): ")
    val opcion = readln().toIntOrNull()

    if (opcion == 1) {
        ejercicio01()
    } else if (opcion == 2) {
        ejercicio02()
    } else if (opcion == 3) {
        ejercicio03()
    } else if (opcion == 4) {
        ejercicio04()
    } else if (opcion == 5) {
        ejercicio05()
    } else if (opcion == 6) {
        ejercicio06()
    } else if (opcion == 7) {
        ejercicio07()
    } else if (opcion == 8) {
        ejercicio08()
    } else if (opcion == 9) {
        ejercicio09()
    } else if (opcion == 10) {
        ejercicio10()
    } else if (opcion == 11) {
        ejercicio11()
    } else if (opcion == 12) {
        ejercicio12()
    } else if (opcion == 13) {
        ejercicio13()
    } else if (opcion == 14) {
        ejercicio14()
    } else if (opcion == 15) {
        ejercicio15()
    } else if (opcion == 16) {
        ejercicio16()
    } else if (opcion == 17) {
        ejercicio17()
    } else if (opcion == 18) {
        ejercicio18()
    } else if (opcion == 19) {
        ejercicio19()
    } else if (opcion == 20) {
        ejercicio20()
    } else if (opcion == 21) {
        ejercicio21()
    } else if (opcion == 22) {
        ejercicio22()
    } else if (opcion == 23) {
        ejercicio23()
    } else if (opcion == 24) {
        ejercicio24()
        // Voluntarios (descomenta los que hagas):
        // } else if (opcion == 25) {
        //     ejercicio25()
        // } else if (opcion == 26) {
        //     ejercicio26()
        // } else if (opcion == 27) {
        //     ejercicio27()
        // } else if (opcion == 28) {
        //     ejercicio28()
    } else {
        println("Opción no válida.")
    }
}

/** 1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
 *  multiplicación, división y módulo (resto de la división). */
fun ejercicio01() {
    val num1 = 10
    val num2 = 3

    println("Suma: ${num1 + num2}")
    println("Resta: ${num1 - num2}")
    println("Multiplicación: ${num1 * num2}")
    println("División: ${num1 / num2}")
    println("Módulo: ${num1 % num2}")
}

/** 2) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
 *  Por ejemplo: si la variable contiene "Pedro", que muestre "Bienvenido, Pedro". */
fun ejercicio02() {
    val nombre = "Paula"
    println("Bienvenido, $nombre")
}

/** 3) Modifica el ejercicio anterior pidiendo al usuario el nombre. */
fun ejercicio03() {
    print("Introduce tu nombre: ")
    val nombre = readln()
    println("Bienvenido, $nombre")
}

/** 4) Solicita por pantalla 2 números y muestra cuál es mayor de los dos. Si son iguales indicarlo también. */
fun ejercicio04() {
    print("Introduce el primer número: ")
    val num1 = readln().toInt()
    print("Introduce el segundo número: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println("$num1 es mayor")
    } else if (num2 > num1) {
        println("$num2 es mayor")
    } else {
        println("Son iguales")
    }
}

/** 5) Lee un número por teclado e indica si es divisible entre 2. Si no lo es, indícalo también. */
fun ejercicio05() {
    print("Introduce un número: ")
    val numero = readln().toInt()

    if (numero % 2 == 0) {
        println("$numero es divisible entre 2")
    } else {
        println("$numero NO es divisible entre 2")
    }
}

/** 6) Pregunta tipo test. Realiza un programa que muestre una pregunta y 4 opciones (a, b, c y d).
 *  Solicita al usuario la respuesta por teclado y muestra si la respuesta es correcta o no.
 *  El programa termina cuando el usuario acierta.
 *
 *  ¿Cuál es la capital de Colombia?:
 *  a. La Paz
 *  b. Buenos Aires
 *  c. La Habana
 *  d. Bogotá
 *  Respuesta: d
 *  ¡Felicitaciones! */
fun ejercicio06() {
    println("¿Cuál es la capital de Colombia?:")
    println("a. La Paz")
    println("b. Buenos Aires")
    println("c. La Habana")
    println("d. Bogotá")

    var acertado = false
    while (!acertado) {
        print("Respuesta: ")
        val respuesta = readln().trim().lowercase()
        if (respuesta == "d") {
            println("¡Felicitaciones!")
            acertado = true
        } else {
            println("Respuesta incorrecta, inténtalo de nuevo.")
        }
    }
}

/** 7) Muestra los números del 1 al 100 (ambos incluidos). */
fun ejercicio07() {
    for (i in 1..100) {
        println(i)
    }
}

/** 8) Haz el mismo ejercicio anterior con otro tipo de bucle. */
fun ejercicio08() {
    var i = 1
    while (i <= 100) {
        println(i)
        i++
    }
}

/** 9) Muestra los números del 100 al 1 (ambos incluidos) que sean divisibles entre 2 y 3. */
fun ejercicio09() {
    for (i in 100 downTo 1) {
        if (i % 2 == 0 && i % 3 == 0) {
            println(i)
        }
    }
}

/** 10) Lee un número por teclado y comprueba si es mayor o igual que cero. Si no lo es, lo volverá a pedir.
 *  Después muestra ese número por consola. */
fun ejercicio10() {
    var numero: Int
    do {
        print("Introduce un número (mayor o igual que 0): ")
        numero = readln().toInt()
    } while (numero < 0)

    println("Número introducido: $numero")
}

/** 11) Escribe una aplicación en la que declares un String que contenga una contraseña cualquiera.
 *  Después te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la
 *  contraseña y mostrará un mensaje diciendo "Enhorabuena, acertaste". Si fallas debe mostrar un mensaje
 *  "Has fallado. Te quedan 'x' intentos".
 *  A tener en cuenta: 3 intentos y si acierta termina, aunque le queden intentos. */
fun ejercicio11() {
    val password = "kotlin123"
    val maxIntentos = 3
    var intentos = 0
    var acertado = false

    while (intentos < maxIntentos && !acertado) {
        print("Introduce la contraseña: ")
        val intento = readln()
        intentos++

        if (intento == password) {
            println("Enhorabuena, acertaste")
            acertado = true
        } else {
            println("Has fallado. Te quedan ${maxIntentos - intentos} intentos")
        }
    }
}

/** 12) Crea una aplicación que nos pida un mes y nos diga si tiene 28/29, 30 ó 31 días.
 *
 *  Introduce un mes (con número del 1 al 12): 9
 *  El mes de septiembre tiene 30 dias */
fun ejercicio12() {
    print("Introduce un mes (con número del 1 al 12): ")
    val mes = readln().toInt()

    val nombre = when (mes) {
        1 -> "enero"
        2 -> "febrero"
        3 -> "marzo"
        4 -> "abril"
        5 -> "mayo"
        6 -> "junio"
        7 -> "julio"
        8 -> "agosto"
        9 -> "septiembre"
        10 -> "octubre"
        11 -> "noviembre"
        12 -> "diciembre"
        else -> null
    }

    if (nombre == null) {
        println("Mes no válido. Debe ser un número del 1 al 12.")
        return
    }

    val dias = when (mes) {
        2 -> "28 o 29"
        4, 6, 9, 11 -> "30"
        else -> "31"
    }

    println("El mes de $nombre tiene $dias dias")
}

/** 13) Crea un programa que pida por pantalla un día de la semana (como String) y nos indique si es un día
 *  laborable (considerando de lunes a viernes) o es fin de semana.
 *  A tener en cuenta: da igual que el usuario introduzca lunes, Lunes, LuNeS,... */
fun ejercicio13() {
    print("Introduce un día de la semana: ")
    val dia = readln().trim().lowercase()

    when (dia) {
        "lunes", "martes", "miércoles", "miercoles", "jueves", "viernes" ->
            println("$dia es un día laborable")
        "sábado", "sabado", "domingo" ->
            println("$dia es fin de semana")
        else ->
            println("Día no válido")
    }
}

/** 14) Realiza una aplicación que pida por pantalla cuántas ventas ha realizado un comercial en el último mes.
 *  A continuación, pedirá tantas cantidades como ventas haya realizado el comercial, de una en una
 *  (por ejemplo, si son 5 ventas pedirá 5 cantidades). Se irán acumulando y, al final, se mostrará por
 *  pantalla la suma de todas las ventas de ese comercial con 2 decimales. */
fun ejercicio14() {
    print("¿Cuántas ventas ha realizado el comercial el último mes? ")
    val numVentas = readln().toInt()

    var total = 0.0

    for (i in 1..numVentas) {
        print("Introduce la cantidad de la venta $i: ")
        val cantidad = readln().replace(",", ".").toDouble()
        total += cantidad
    }

    println("La suma de todas las ventas es: ${"%.2f".format(total)}")
}

/** 15) Modifica el ejercicio anterior de tal manera que el usuario vaya introduciendo ventas hasta que
 *  escriba un * (asterisco). Al finalizar, se mostrará el número de ventas realizado y la suma total de las
 *  ventas del comercial con 2 decimales. */
fun ejercicio15() {
    var total = 0.0
    var numVentas = 0

    while (true) {
        print("Introduce la cantidad de la venta ${numVentas + 1} (* para terminar): ")
        val entrada = readln().trim()

        if (entrada == "*") {
            break
        }

        val cantidad = entrada.replace(",", ".").toDoubleOrNull()
        if (cantidad == null) {
            println("Cantidad no válida, inténtalo de nuevo.")
        } else {
            total += cantidad
            numVentas++
        }
    }

    println("Número de ventas realizadas: $numVentas")
    println("La suma total de las ventas es: ${"%.2f".format(total)}")
}

/** 16) Programa que pide por teclado dos números y genera 10 números aleatorios entre ellos (ambos incluidos). */
fun ejercicio16() {
    print("Introduce el primer número: ")
    val a = readln().toInt()
    print("Introduce el segundo número: ")
    val b = readln().toInt()

    val min = minOf(a, b)
    val max = maxOf(a, b)

    println("10 números aleatorios entre $min y $max:")
    for (i in 1..10) {
        val aleatorio = (min..max).random()
        println(aleatorio)
    }
}

/** 17) Contar (y mostrar por pantalla) las vocales, consonantes, números y espacios en blanco de una cadena
 *  de caracteres que se pedirá por pantalla. */
fun ejercicio17() {
    print("Introduce una cadena de caracteres: ")
    val cadena = readln()

    var vocales = 0
    var consonantes = 0
    var numeros = 0
    var espacios = 0

    for (c in cadena.lowercase()) {
        if (c in "aeiouáéíóúü") {
            vocales++
        } else if (c in 'a'..'z' || c == 'ñ') {
            consonantes++
        } else if (c.isDigit()) {
            numeros++
        } else if (c == ' ') {
            espacios++
        }
    }

    println("Vocales: $vocales")
    println("Consonantes: $consonantes")
    println("Números: $numeros")
    println("Espacios en blanco: $espacios")
}

/** 18) Reemplaza todas las aes de la cadena "La lluvia en Sevilla es una maravilla" por e's. */
fun ejercicio18() {
    val frase = "La lluvia en Sevilla es una maravilla"
    val resultado = frase.replace('a', 'e')

    println("Original:  $frase")
    println("Resultado: $resultado")
}

/** 19) Crea una aplicación que pida 2 operandos. A continuación, muestre un menú con las siguientes operaciones:
 *  1: suma los operandos.
 *  2: resta los operandos.
 *  3: multiplica los operandos.
 *  4: divide los operandos
 *  5: potencia (1º operando como base y 2º como exponente).
 *  6: módulo, resto de la división entre operando1 y operando2.
 *  7: pedir 2 operandos nuevos
 *  8: Salir
 *  Según la opción elegida, realizará la operación correspondiente. A continuación mostrará el resultado por
 *  consola. El programa terminará al pulsar la opción 8 (Salir). */
fun ejercicio19() {
    print("Introduce el primer operando: ")
    var op1 = readln().replace(",", ".").toDouble()
    print("Introduce el segundo operando: ")
    var op2 = readln().replace(",", ".").toDouble()

    var opcion = 0

    while (opcion != 8) {
        println()
        println("Operandos actuales: $op1 y $op2")
        println("1: Suma")
        println("2: Resta")
        println("3: Multiplicación")
        println("4: División")
        println("5: Potencia (op1 ^ op2)")
        println("6: Módulo (resto de op1 / op2)")
        println("7: Pedir 2 operandos nuevos")
        println("8: Salir")
        print("Elige una opción: ")

        opcion = readln().toIntOrNull() ?: 0

        when (opcion) {
            1 -> println("$op1 + $op2 = ${op1 + op2}")
            2 -> println("$op1 - $op2 = ${op1 - op2}")
            3 -> println("$op1 * $op2 = ${op1 * op2}")
            4 -> {
                if (op2 == 0.0) {
                    println("No se puede dividir entre 0")
                } else {
                    println("$op1 / $op2 = ${op1 / op2}")
                }
            }
            5 -> println("$op1 ^ $op2 = ${Math.pow(op1, op2)}")
            6 -> {
                if (op2 == 0.0) {
                    println("No se puede calcular el módulo con 0")
                } else {
                    println("$op1 % $op2 = ${op1 % op2}")
                }
            }
            7 -> {
                print("Introduce el primer operando: ")
                op1 = readln().replace(",", ".").toDouble()
                print("Introduce el segundo operando: ")
                op2 = readln().replace(",", ".").toDouble()
            }
            8 -> println("Saliendo...")
            else -> println("Opción no válida")
        }
    }
}

/** 20) Realizar la suma desde 1 hasta un número que se pedirá por pantalla (que debe ser mayor que 1.
 *  Si no, se pedirá de nuevo).
 *
 *  Inserta un numero entero mayor que 1: 5
 *  La suma desde 1 hasta 5 es: 15      (1+2+3+4+5=15) */
fun ejercicio20() {
    var numero: Int?

    do {
        print("Inserta un numero entero mayor que 1: ")
        numero = readln().trim().toIntOrNull()

        if (numero == null || numero <= 1) {
            println("Número no válido, debe ser un entero mayor que 1.")
        }
    } while (numero == null || numero <= 1)

    var suma = 0
    for (i in 1..numero) {
        suma += i
    }

    println("La suma desde 1 hasta $numero es: $suma")
}

/** 21) Solicitar una frase al usuario. Eliminar los espacios y mostrar la cadena resultante por consola. */
fun ejercicio21() {
    TODO("Ejercicio 21")
}

/** 22) Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacía.
 *  Mostrar la cadena resultante.
 *
 *  Introduce un texto, cadena vacía para terminar
 *  Esta es la primera frase
 *  ...
 *  Cadena resultante:
 *  ----------------------------------------
 *      Esta es la primera frase
 *      ... */
fun ejercicio22() {
    TODO("Ejercicio 22")
}

/** 23) Solicitar una frase al usuario. Separarla por palabras y mostrarlas por consola (una por línea). */
fun ejercicio23() {
    TODO("Ejercicio 23")
}

/** 24) Pedir números enteros al usuario (positivos o negativos) y cuando introduzca un -1 terminará el programa.
 *  Al terminar, mostrará: mayor número introducido, menor número introducido, suma de todos los números,
 *  suma de los números positivos y suma de los números negativos. El número -1 no cuenta como número.
 *
 *  El menor es: -8
 *  El mayor es: 65
 *  La suma es: 80
 *  La suma de los positivos es: 90
 *  La suma de los negativos es: -10 */
fun ejercicio24() {
    TODO("Ejercicio 24")
}

// ---------------------------------------------------------------------------- Voluntarios

/** 25) Voluntario: Pide un número por teclado e indica si es un número primo o no. Si se introduce un número
 *  menor o igual que 1, directamente no es primo. */
fun ejercicio25() {
    TODO("Ejercicio 25")
}

/** 26) Voluntario: Muestra los números primos entre dos valores que se pedirán por pantalla. */
fun ejercicio26() {
    TODO("Ejercicio 26")
}

/** 27) Voluntario: Crear una aplicación que permita insertar números hasta que insertemos un -1.
 *  Mostrar el número de números introducidos. */
fun ejercicio27() {
    TODO("Ejercicio 27")
}

/** 28) Voluntario: Convertir una frase a mayúsculas o minúsculas (opción que elegirá el usuario) y mostrar el
 *  resultado por pantalla. */
fun ejercicio28() {
    TODO("Ejercicio 28")
}

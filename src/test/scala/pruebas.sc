import Derivacion . _
import math .pow

// Funciones a ser pasadas
val a = (x: Double) => 2.0
val b = (x: Double) => x*x*x
val c = (x: Double) => 2*x*x
val d = (x: Double) => x
val e = (x: Double) => 5*x*x*x

// Pruebas
derivada(a)(2) // 0
derivada(b)(1) // 3
derivada(c)(2) // 8
derivada(d)(1) // 1
derivada(e)(2) // 60
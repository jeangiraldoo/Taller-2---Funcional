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


//Pruebas del taller

val cte = (x:Double) => 2.0
val f = (x:Double) => (x*x)
val g = (x:Double) => (x*x*x)
val h = (x:Double) => f(x) / g(x)
val j = (x:Double) => g(x) / f(x)

val h1 = derivadaDiv(f, g)
val h2 = derivadaDiv(g, f)

h1(2)
h2(2)

derivada(cte)(5)
derivada(cte)(6)

//pruebas extra

val w = (x:Double) =>  x * x + 4 * x + 4
val s = (x:Double) =>  x * x * x - 2 * x
val p = (x:Double) =>  (x * x + 1) / (x + 1)


val h3 = derivadaDiv(w, s)
val h4 = derivadaDiv(s, w)
val h5 = derivadaMult(w, s)
val h6 = derivadaMult(p, s)

h3(1)  // -15.0
h4(1)  // 0.185
h5(1)  // 3.0
h6(2)  // 19.77


val t = (x:Double) => Math.sin(x)
val r = (x:Double) => Math.exp(x)
val l = (x:Double) => Math.log(x)
val v = (x:Double) => Math.sin(x * x)
val x = (x:Double) => Math.sqrt(x)

val dt = derivada(t)
val de = derivada(r)
val dl = derivada(l)
val dc = derivada(v)
val dr = derivada(x)

dt(1) // 0.540
de(1) // 2.718
dl(1) // 1.0
dc(1) // 1.080
dr(1) // 0.5


val y = (x:Double) => Math.sqrt(x) * Math.exp(x)
val q = (x:Double) => Math.sin(x)/Math.sqrt(x) + Math.exp(x)

val dy = derivada(y)
val dq = derivada(q)
val dyq = derivadaMult(y, q)

dy(5)   // 364
dq(5)   // 148
dyq(5)  // 103330.39
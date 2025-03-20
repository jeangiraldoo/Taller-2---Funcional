import Derivacion . _
import math .pow

// Funciones a ser pasadas
val a = (x: Double) => 4.0
val b = (x: Double) => x*x*x*x
val c = (x: Double) => 2*x*x
val d = (x: Double) => x
val e = (x: Double) => 5*x*x*x

// Pruebas
derivada(a)(1) // 0
derivada(b)(32) // 131072.0
derivada(c)(3) // 12.0
derivada(d)(10) // 0.99
derivada(e)(5) // 374.99

derivadaSuma(a, b)(1) // 4.0
derivadaSuma(c, d)(32) // 129.0
derivadaSuma(d, e)(3) // 136.0
derivadaSuma(a, d)(10) // 0.99
derivadaSuma(a, e)(5) // 374.99

derivadaResta(a, b)(1) // -4.0
derivadaResta(c, d)(32) // 127.0
derivadaResta(d, e)(3) // -134.0
derivadaResta(a, d)(10) // -0.99
derivadaResta(a, e)(5) // -374.99

derivadaDiv(a, b)(1) // -16.0
derivadaDiv(c, d)(32) // 2.0
derivadaDiv(d, e)(3) // -0.015
derivadaDiv(a, d)(10) // -0.04
derivadaDiv(a, e)(5) // -0.0038

derivadaMult(a, b)(1) // 16.0
derivadaMult(c, d)(32) // 6144.0
derivadaMult(d, e)(3) // 540.0
derivadaMult(a, d)(10) // 3.99
derivadaMult(a, e)(5) // 1499.99


//Pruebas de ejemplo del taller
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

//pruebas extra usando nuevas funciones anónimas y de scala

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
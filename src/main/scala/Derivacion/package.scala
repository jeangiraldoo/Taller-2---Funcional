package object Derivacion {
  def derivada(f: Double => Double): Double => Double = {
    val h = 1e-5
    x => (-f(x + 2 * h) + 8 * f(x + h) - 8 * f(x - h) + f(x - 2 * h)) / (12 * h)
  }

  def derivadaMult(f: Double => Double, g: Double => Double): Double => Double = {
    (z: Double) => {
      derivada(f)(z) * g(z) + f(z) * derivada(g)(z)
    }
  }

  def derivadaDiv(f: Double => Double, g: Double => Double): Double => Double = {
    (z: Double) => {
      (derivada(f)(z) * g(z) - f(z) * derivada(g)(z)) / (g(z) * g(z))
    }
  }
}

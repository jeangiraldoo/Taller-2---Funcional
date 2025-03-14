package object Derivacion {
  def derivada(f: Double => Double): Double => Double = {
    val h = 1e-5
    x => (-f(x + 2 * h) + 8 * f(x + h) - 8 * f(x - h) + f(x - 2 * h)) / (12 * h)
  }
}

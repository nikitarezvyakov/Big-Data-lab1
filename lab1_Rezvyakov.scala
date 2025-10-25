import scala.util.Random
import scala.io.StdIn.readInt

object SumLastNElements extends App {

  val random = new Random()
  val listSize = 10
  val numbers: List[Int] = List.fill(listSize)(random.nextInt(100)) // 0..99

  println(s"Сгенерированный список: $numbers")

  print("Введите N (кол-во последних элементов для суммирования): ")
  val n = readInt()

  def sumLastN(list: List[Int], n: Int): Int = {
    list.takeRight(n).sum
  }

  val result = sumLastN(numbers, n)
  println(s"Сумма последних $n элементов: $result")
}
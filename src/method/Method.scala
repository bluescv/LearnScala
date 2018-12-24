package method

/**
  * Created by LXY on 2018/12/19.
  */
object Method {
  def main(args: Array[String]) {
    println("Returned Value : " + addInt(5, 7));
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }
}

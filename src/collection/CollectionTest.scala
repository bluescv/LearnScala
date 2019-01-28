package collection

/**
  * Created by LXY on 2019/1/28.
  */
object CollectionTest {
  def main(args: Array[String]): Unit = {
    var list = List[List[Int]]()
    var tempList = List[Int](1, 2, 3)
    tempList = tempList ::: List(4)

    list = tempList :: list
    println(list)
  }
}

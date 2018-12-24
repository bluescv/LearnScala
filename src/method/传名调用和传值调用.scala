package method

/**
  * Created by LXY on 2018/12/19.
  */
object 传名调用和传值调用 {
  def main(args: Array[String]) {
    delayed(time());
  }

  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  //  def delayed(t: Long) = {
  def delayed(t: => Long) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }
}

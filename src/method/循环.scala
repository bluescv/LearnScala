package method

/**
  * Created by LXY on 2018/12/24.
  */
object TestLoop {
  def main(args: Array[String]) {
    var a = 0;
    // for 循环
    for( a <- (1 to 10).reverse){
      println( "Value of a: " + a );
    }
  }
}
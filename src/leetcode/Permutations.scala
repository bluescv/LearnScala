package leetcode

import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks._

/**
  * Created by LXY on 2018/12/24.
  */
object Permutation {
  def main(args: Array[String]): Unit = {
    var input = Array(1, 2, 3)
    permute(input)

    for (i <- input) {
      print(i)
    }
  }

  def backtrack(list: ListBuffer[ListBuffer[Int]], tempList: ListBuffer[Int], nums: Array[Int]): Unit = {
    if (tempList.size == nums.length) {
      //      tempList :: list
      list.append(tempList)
    } else {
      for (i <- 0 to nums.length - 1) {
        breakable {
          if (tempList.contains(nums(i))) {
            break
          }
          //          tempList = tempList ::: List()
          tempList.append(nums(i))
          backtrack(list, tempList, nums)
          tempList.remove(tempList.size - 1)
        }
      }
    }
  }

  def permute(nums: Array[Int]): List[ListBuffer[Int]] = {
    var list = ListBuffer[ListBuffer[Int]]()
    var tempList = ListBuffer[Int]()
    backtrack(list, tempList, nums)
    return list.toList
  }

}

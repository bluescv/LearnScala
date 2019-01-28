package leetcode

import scala.util.control.Breaks._

/**
  * Created by LXY on 2018/12/24.
  */
object Solution {
  def main(args: Array[String]): Unit = {
    var input = Array(1, 3, 2)
    nextPermutation(input)

    for (i <- input) {
      print(i)
    }
  }


  def nextPermutation(nums: Array[Int]): Unit = {
    if (nums.length <= 1) {
      return;
    }

    var length = nums.length - 1;
    var i = length
    var x = i
    breakable {
      for (i <- (1 to length).reverse) {
        if (nums(i) > nums(i - 1)) { //find first number which is smaller than it's after number
          break
        }
        x= x-1
      }
    }
    if (x != 0) {
      swap(nums, x - 1); //if the number exist,which means that the nums not like{5,4,3,2,1}
    }

    reverse(nums, x);
  }

  def swap(a: Array[Int], i: Int): Unit = {
    var j = a.length - 1
    breakable {
      while (j > i) {
        if (a(j) > a(i)) {
          var t = a(j);
          a(j) = a(i);
          a(i) = t;
          break;
        }
        j = j - 1
      }
    }
  }

  def reverse(a: Array[Int], i: Int): Unit = {
    //reverse the number after the number we have found
    var first = i;
    var last = a.length - 1;
    while (first < last) {
      var t = a(first);
      a(first) = a(last);
      a(last) = t;
      first = first + 1;
      last = last - 1
    }
  }

}

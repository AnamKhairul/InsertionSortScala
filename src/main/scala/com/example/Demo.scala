package com.example

object Demo {
   def main(args: Array[String]): Unit = {
      var data: Array[Int] = Array[Int](7, -7, -3, 3, 4, -4, -9, 9, -1, 0, 1, -8, 8, 5, -5, -6, 6, -2, 2)

      // Sort in ascending order
      var result1: Array[Int] = InsertionSort.sort(data)
      print("\nAscending Output: ")
      for (a <- result1) print(a+", ")

      // Sort in descending order
      var result2: Array[Int] = InsertionSort.sort(data, false)
      print("\nDescending Output: ")
      for (a <- result2) print(a + ", ")
   }
}

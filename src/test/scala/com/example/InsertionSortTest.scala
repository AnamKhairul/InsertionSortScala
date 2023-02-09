package com.example

import org.scalatest.funsuite.AnyFunSuite

class InsertionSortTest extends AnyFunSuite {
   test("InsertionSort.sort(empty data set)") {
      var data: Array[Int] = new Array[Int](0)
      var output = InsertionSort.sort(data)
      assert(output.length == 0)
   }

   test("InsertionSort.sort(single element)") {
      var data: Array[Int] = Array[Int](5)
      var output = InsertionSort.sort(data, true)
      assert(output(0) === 5)
   }

   test("InsertionSort.sort(ascending)") {
      var data: Array[Int] = Array[Int](7, 3, 5)
      var output = InsertionSort.sort(data, true)
      assert(output(0) === 3)
   }

   test("InsertionSort.sort(descending)") {
      var data: Array[Int] = Array[Int](7, 3, 5)
      var output = InsertionSort.sort(data, false)
      assert(output(0) === 7)
   }
}

package com.example

object InsertionSort {
   /**
    * Sorts input array in ascending order if order is set to true, otherwise in descending order
    *
    * @param input
    * @param order
    * @return
    */
   def sort(input: Array[Int], order: Boolean = true): Array[Int] = {
      // Return if no data to process
      if (input.length <= 0) return input

      // Create an output array for the result
      var output: Array[Int] = new Array[Int](input.length)

      if (order) { // Sort in ascending order
         for (i <- 0 to input.length - 1) {
            val value: Int = input(i)
            var j = i - 1
            while (j >= 0 && value < output(j)) {
               output(j + 1) = output(j)
               j = j - 1
            }
            output(j + 1) = value
         }
      } else { // Sort in descending order
         for(i <- 0 to input.length-1) {
            val value: Int = input(i)
            var j = i - 1
            while (j >= 0 && value > output(j)) {
               output(j + 1) = output(j)
               j = j - 1
            }
            output(j + 1) = value
         }
      }

      return output
   }
}

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

      // Copy data into a local array for processing
      var output: Array[Int] = new Array[Int](input.length)

      for (i <- 0 to input.length - 1) output(i) = input(i)

      // Sort data
      for (i <- 1 to output.length - 1) {
         var value: Int = output(i)

         if (order) { // Sort in ascending order
            var j = i - 1
            while (j >= 0 && value < output(j)) {
               output(j + 1) = output(j)
               j = j - 1
            }
            output(j + 1) = value
         } else { // Sort in descending order
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

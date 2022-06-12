
def lastCharactersToUpper(str: String, count: Int): String = {
    str.take(str.length() - count) + str.drop(str.length() - count).toUpperCase()
   }

def getMinimumSubArraySum(n: Int, array: List[Int]): Int = {
    if (n > array.size) {
      return 0;
    }

    var minimumSubArray = array.take(n)
    var minimumSum = minimumSubArray.sum

    for( i <- 1 to array.size - n) {
      val subArray = array.slice(i, i + n)
      val currentSubArraySum = subArray.sum

      if (currentSubArraySum < minimumSum ){
        minimumSum = currentSubArraySum
        minimumSubArray = subArray
      }
    }

    minimumSum
  }

 def countOccurrences(text: String, subtext: String): Int =
   text.sliding(subtext.length).count(_ == subtext)

 def sumSubstrings(text: String, str1: String, str2: String): String = {
    str1 + ": " + countOccurrences(text, str1) + " occurrences" + "\n" +
    str2 + ": " + countOccurrences(text, str2) + " occurrences"
  }


// 1st task
println(lastCharactersToUpper("lorem ipsum dolor sit amet", 4))

// 2nd task
println(getMinimumSubArraySum(3, List(4, 2, 9, 2, 2, 3, 9, 9, 9, 3)))

// 3rd task
println(sumSubstrings("aaabgdccdaaaddwsdde", "aaa", "dde"))
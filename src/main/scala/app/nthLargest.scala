package app

class NumberNotPossibleException extends Exception

object nthLargest extends App {

  def apply(input: List[Int], nth : Int) : Any = {
    val uniqueNums = input.distinct
    if (nth <= uniqueNums.length) {
      uniqueNums(uniqueNums.length - nth)
    } else {
      throw new NumberNotPossibleException
    }
  }
}

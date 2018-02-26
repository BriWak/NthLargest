import app.{NumberNotPossibleException, nthLargest}
import org.scalatest.{MustMatchers, WordSpec}

class nthLargestSpec extends WordSpec with MustMatchers {

  "nthLargest" must {

    "return 4 when given List(1,2,3,4,5) and 2" in {
      nthLargest(List(1, 2, 3, 4, 5), 2) mustEqual 4
    }

    "return 3 when given List(3,3,4,4,5,5) and 3" in {
      nthLargest(List(3, 3, 4, 4, 5, 5), 3) mustEqual 3
    }

    "throw an error when given List(1,2) and 3" in {
      intercept[NumberNotPossibleException] {
        nthLargest(List(1, 2), 3)
      }
    }
  }
}

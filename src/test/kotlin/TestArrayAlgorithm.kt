import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class TestArrayAlgorithm {

    /*
    1 ONE       1 ONE
    *
    2 TWO
    3 THREE     3 TWO
    4 FOUR      4 THREE
    5 FIVE      5 FOUR
                6 FIVE
    -6 SIX      2 SIX
    7 SEVEN     7 SEVEN

     */

    @Test
    fun testPermutation() {
        moveElementToPosition(listToTest, listToTest.get(0), listToTest.get(5)) //
    }

    fun moveElementToPosition(list : MutableList<TestObject>, behindThisTestObject : TestObject, currentObject: TestObject){
        val begin = behindThisTestObject.position + 1
        val end = currentObject.position



        list.filter{it.position in begin..end}
            .forEachIndexed { index, element ->
                run {
                    element.position = begin + index + 1
                }
            }
        currentObject.position = begin
        print("")
    }

    companion object {

        val listToTest = mutableListOf<TestObject>()

        @BeforeAll
        @JvmStatic
        internal fun beforeAll() {

            listToTest.add(TestObject("ONE", 1))
            listToTest.add(TestObject("TWO", 2))
            listToTest.add(TestObject("THREE", 3))
            listToTest.add(TestObject("FOUR", 4))
            listToTest.add(TestObject("FIVE", 5))
            listToTest.add(TestObject("SIX", 6))
            listToTest.add(TestObject("SEVEN", 7))
        }

    }

}
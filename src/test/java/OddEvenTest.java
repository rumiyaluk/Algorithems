import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddEvenTest {
    @Order(1)
    @Test
    public void testOddEvenHappyPathPositive() {
        int num = 5;
        int expectedResult = Integer.parseInt("Odd");
        OddEven as = new OddEven();
        String actualResult = as.oddEvenNumbers(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathPositiveResult() {
        int num = 10;
        int expectedResult = Integer.parseInt("Even");
        OddEven as = new OddEven();
        String actualResult = as.oddEvenNumbers(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testOddEvenHappyPathNegativeResult(){
        int num = -1;
        int expectedResult = Integer.parseInt("Odd");
        OddEven as = new OddEven();
        String actualResult = as.oddEvenNumbers(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void testOddEvenHappyPathNegativeEvenNumber(){
        int num = -2;
        int expectedResult = Integer.parseInt("Even");
        OddEven as = new OddEven();
        String actualResult = as.oddEvenNumbers(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void testOddEvenHappyPathZeroNumber(){
        int num = 0;
        int expectedResult = Integer.parseInt("Even");
        OddEven as = new OddEven();
        String actualResult = as.oddEvenNumbers(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddEvenHappyPathPositiveUndefined(){
        long num = -25465491L;
        int expectedResult = Integer.parseInt("Undefined");
        OddEven as = new OddEven();
        String actualResult = as.oddEvenNumbers((int) num);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddEvenHappyPathNegativeUndefined(){
        long num = 25465498L;
        int expectedResult = Integer.parseInt("Undefined");
        OddEven as = new OddEven();
        String actualResult = as.oddEvenNumbers((int) num);
        Assertions.assertEquals(expectedResult, actualResult);
    }


}

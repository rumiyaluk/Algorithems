import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {
    @Order(1)
    @Test
    public void testOddIndicesTestHappyPathNegative() {
        int [] array  = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 985, 68};
        OddIndices as = new OddIndices();
        int [] actualResult = as.OddIndices(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testOddIndicesTestHappyPathPositive() {
        int [] array  = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {-45, 985};
        OddIndices as = new OddIndices();
        int [] actualResult = as.OddIndices(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

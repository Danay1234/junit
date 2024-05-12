import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    private Calculator calculator = new Calculator();
    
    @Test
    public void testAddPositiveIntegers() {
        int result = calculator.add(5, 7);
        Assert.assertEquals(12, result);
    }

    @Test
    public void testAddNegativeIntegers() {
        int result = calculator.add(-3, -2);
        Assert.assertEquals(-5, result);
    }
    
}

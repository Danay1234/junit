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

    @Test
    public void testSqrt() {
        Assert.assertEquals(2.0, calculator.sqrt(4.0), 0.01);
        Assert.assertEquals(2.1, calculator.sqrt(5.0), 0.01); //supposed to fail
    }

    @Test
    public void testSqrt() {
        Assert.assertEquals(2.0, calculator.sqrt(4.0), 0.001);
        Assert.assertEquals(0.0, calculator.sqrt(0.0), 0.001);
        Assert.assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-1.0));
    }
    
}

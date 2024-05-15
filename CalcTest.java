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
    public void negativeSquareRoot() {
        Assert.assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-1.0));
    }

    @Test
    public void testDivide() {
        //third argument is the acceptable difference between the expected and the actual result
        Assert.assertEquals(2, calculator.divide(6, 3), 0.001);
        Assert.assertEquals(-2, calculator.divide(6, -3), 0.001);
    }

    @Test
    public void divideByZero(){
        Assert.assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0));
    }

    @Test
    public void factorialTestNegativeInput() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
        assertEquals("Negative numbers not allowed", thrown.getMessage());
    }

    @Test
    public void factorialTestZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void factorialTestSmallNumbers() {
        assertEquals(1, calculator.factorial(1));
        assertEquals(2, calculator.factorial(2));
        assertEquals(6, calculator.factorial(3));
        assertEquals(24, calculator.factorial(4));
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void factorialTestLargeNumbers() {
        //last possible value will be 20!
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }

    @Test
    public void factorialTestBoundaryValues() {
        // Edge cases around long's max value (2^63 - 1)
        assertThrows(ArithmeticException.class, () -> calculator.factorial(21)); // This might overflow
    }

    
}

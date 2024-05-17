import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
public class CalcTest {

    private Calculator calculator = new Calculator();
    //another calculator
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
        Assert.assertEquals(2.23, calculator.sqrt(5.0), 0.01); //supposed to fail
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

    @Test
    public void testZeroBase() {
        assertEquals(0, calculator.power(0, 5), 1e-9); // 0^5 = 0
    }

    @Test
    public void testZeroExponent() {
        assertEquals(1, calculator.power(2, 0), 1e-9); // 2^0 = 1
        assertEquals(1, calculator.power(-3, 0), 1e-9); // (-3)^0 = 1
    }

    @Test
    public void testNegativeExponents() {
        assertEquals(0.5, calculator.power(2, -1), 1e-9); // 2^-1 = 0.5
        assertEquals(0.25, calculator.power(2, -2), 1e-9); // 2^-2 = 0.25
        assertEquals(-0.125, calculator.power(-2, -3), 1e-9); // (-2)^-3 = -0.125
    }

    @Test
    public void testFractionalBases() {
        assertEquals(0.25, calculator.power(0.5, 2), 1e-9); // 0.5^2 = 0.25
        assertEquals(4, calculator.power(0.5, -2), 1e-9); // 0.5^-2 = 4
        assertEquals(0.125, calculator.power(0.5, 3), 1e-9); // 0.5^3 = 0.125
    }

    @Test
    public void testZeroToZeroExponent() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.power(0, 0);
        });
    }

    @Test
    public void testZeroToNegativeExponent(){
        assertThrows(ArithmeticException.class, () -> {
            calculator.power(0, -5);
        });
    }

    @Test
    public void gcdTestZeroInputs() {
        assertEquals(5, calculator.gcd(0, 5)); // should be 5
        assertEquals(7, calculator.gcd(7, 0)); // should be 7
        assertEquals(0, calculator.gcd(0, 0)); 
    }

    @Test
    public void gcdTestPositiveNumbers() {
        assertEquals(6, calculator.gcd(54, 24)); // gcd(54, 24) = 6
        assertEquals(1, calculator.gcd(17, 13)); // gcd(17, 13) = 1
        assertEquals(4, calculator.gcd(20, 8)); // gcd(20, 8) = 4
    }

    @Test
    public void gcdTestEqualNumbers() {
        assertEquals(5, calculator.gcd(5, 5)); // gcd(5, 5) = 5
        assertEquals(12, calculator.gcd(12, 12)); // gcd(12, 12) = 12
    }

    @Test
    public void gcdTestCommutativity() {
        assertEquals(calculator.gcd(18, 24), calculator.gcd(24, 18)); // gcd(18, 24) = gcd(24, 18)
        assertEquals(calculator.gcd(100, 25), calculator.gcd(25, 100)); // gcd(100, 25) = gcd(25, 100)
    } 

        @Test
    public void gcdTestPrimeNumbers() {
        assertEquals(1, calculator.gcd(13, 17)); // gcd(13, 17) = 1
        assertEquals(1, calculator.gcd(29, 19)); // gcd(29, 19) = 1
    }

    @Test
    public void arrayTestSumArrayEmpty() {
        //added this. but it currently fails.
        int[] arr = {};
        int expected = 0;
        int actual = calculator.sumArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void arrayTestPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 15;
        int actual = calculator.sumArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void arrayTestMixedNumbers() {
        int[] arr = {1, -2, 3, -4, 5};
        int expected = 3;
        int actual = calculator.sumArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxArrayBasic() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(5, calculator.maxArray(arr));
    }

    @Test
    public void testMaxArrayNegativeNumbers() {
        int[] arr = {-5, -3, -1, -2, -4};
        assertEquals(-1, calculator.maxArray(arr));
    }

    @Test
    public void testMaxArraySingleElement() {
        int[] arr = {10};
        assertEquals(10, calculator.maxArray(arr));
    }

    @Test
    public void testMaxArrayWithDuplicates() {
        int[] duplicatesArray = {10, 20, 20, 15, 10};
        int max = calculator.maxArray(duplicatesArray);
        assertEquals(20, max);
    }

    @Test
    public void testAverageNormalCase() {
        int[] arr = {1, 2, 3, 4, 5};
        double expected = 3.0;
        assertEquals(expected, calculator.averageArray(arr), 0.0001);
    }

    @Test
    public void testAverageSingleElement() {
        int[] arr = {42};
        double expected = 42.0;
        assertEquals(expected, calculator.averageArray(arr), 0.0001);
    }

    @Test
    public void testAverageEmptyArray() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.averageArray(arr);
        });
    }

    @Test
    public void testMedianEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.medianArray(new int[0]);
        });
    }

    @Test
    public void testMedianNormalOddCase() {
        int[] arr = {3, 1, 2};
        double expected = 2.0;
        assertEquals(expected, calculator.medianArray(arr), 0.0001);
    }

    @Test
    public void testMedianNormalEvenCase() {
        int[] arr = {3, 1, 2, 4};
        double expected = 2.5;
        assertEquals(expected, calculator.medianArray(arr), 0.0001);
    }

    @Test
    public void testMedianSingleElement() {
        int[] arr = {42};
        double expected = 42.0;
        assertEquals(expected, calculator.medianArray(arr), 0.0001);
    }

    @Test
    public void testMedianArrayWithNegativeNumbers() {
        int[] arr = {-5, -1, -3};
        double expected = -3.0;
        assertEquals(expected, calculator.medianArray(arr), 0.0001);
    }
    
    
}

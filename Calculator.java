public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        if (n > 20){
            //if the resulting factorial will be too large to fit in a long (which is 21 and above).
            throw new ArithmeticException("The Resulting number will be too big to fit inside a long type.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //include many test cases for this method later.
    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }

        double guess = a / 2.0;
        double acceptableDifference = 1e-10;
        double difference = guess * guess - a;

        while (Math.abs(difference) > acceptableDifference) {
            guess = (guess + a / guess) / 2.0;
            difference = guess * guess - a;
        }

        return guess;
    }

    public double power(double base, int exponent) {
        if(base == 0.0 && exponent <= 0){
            throw new ArithmeticException("The exponent you chose for the base 0 is invalid.");
        }
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        return exponent < 0 ? 1 / result : result;
    }

    public int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int maxArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double averageArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        return (double) sumArray(arr) / arr.length;
    }

    public double medianArray(int[] arr) {
        //method used for finding the middle element or median in statistical naming 
        return 0;
    }


}

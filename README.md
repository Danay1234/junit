Testing and Collaboration Using Git&Github and JUnit

Repository Name: JUnit

Description
This repository demonstrates how testing works using JUnit. It contains two primary files:
- `Calculator.java`: A class that includes various methods for mathematical operations.
- `CalcTest.java`: A class that tests these methods using JUnit.

Table of Contents
- [Features](#features)
- [Methods](#methods)
- [Usage](#usage)
- [Contributors](#contributors)
- [Contributing](#contributing)
- [Credits](#credits)

Features
- A set of mathematical operations implemented in `Calculator.java`.
- Extensive testing of these operations using JUnit in `CalcTest.java`.
- Collaboration and contribution through GitHub's fork and pull request model.

Methods
The `Calculator.java` class includes the following methods:
- `add(int a, int b)`: Adds two integers.
- `subtract(int a, int b)`: Subtracts the second integer from the first.
- `multiply(int a, int b)`: Multiplies two integers.
- `divide(double a, double b)`: Divides the first integer by the second.
- `factorial(int n)`: Calculates the factorial of an integer.
- `sqrt(double a)`: Calculates the square root of a double using a custom algorithm.
- `power(double base, int exponent)`: Raises a base to an exponent.
- `gcd(int a, int b)`: Finds the greatest common divisor of two integers.
- `maxArray(int[] arr)`: Finds the maximum value in an array of integers.
- `sumArray(int[] arr)`: Calculates the sum of an array of integers.
- `averageArray(int[] arr)`: Calculates the average of an array of doubles.
- `medianArray(int[] arr)`: Finds the median value in an array of integers.
- `isPrime(int n)`: Checks if an integer is a prime number.

The `CalcTest.java’ class includes the following test cases:
1. testAddPositiveIntegers: Tests the `add` method with positive integer inputs.
2. testAddNegativeIntegers: Tests the `add` method with negative integer inputs.
3. testSqrt: Tests the `sqrt` method with valid and invalid (negative) inputs.
4. negativeSquareRoot: Tests that the `sqrt` method throws an `IllegalArgumentException` for negative inputs.
5. testDivide: Tests the `divide` method with positive and negative integer inputs.
6. divideByZero: Tests that the `divide` method throws an `ArithmeticException` when the divisor is zero.
7. factorialTestNegativeInput: Tests that the `factorial` method throws an `IllegalArgumentException` for negative inputs.
8. factorialTestZero: Tests that the `factorial` method returns 1 for the input 0.
9. factorialTestSmallNumbers: Tests the `factorial` method for small positive integer inputs.
10. factorialTestLargeNumbers: Tests the `factorial` method for a large positive integer input (20).
11. factorialTestBoundaryValues: Tests that the `factorial` method throws an `ArithmeticException` for inputs that might overflow the `long` data type.
12. testZeroBase: Tests the `power` method with a base of 0 and various exponents.
13. testZeroExponent: Tests the `power` method with a base of 2 and -3 and an exponent of 0.
14. testNegativeExponents: Tests the `power` method with negative exponents.
15. testFractionalBases: Tests the `power` method with fractional bases.
16. testZeroToZeroExponent: Tests that the `power` method throws an `ArithmeticException` when the base and exponent are both 0.
17. testZeroToNegativeExponent: Tests that the `power` method throws an `ArithmeticException` when the base is 0 and the exponent is negative.
18. gcdTestZeroInputs: Tests the `gcd` method with various combinations of 0 as input.
19. gcdTestPositiveNumbers: Tests the `gcd` method with positive integer inputs.
20. gcdTestEqualNumbers: Tests the `gcd` method with equal integer inputs.
21. gcdTestCommutativity: Tests the commutativity of the `gcd` method.
22. gcdTestPrimeNumbers: Tests the `gcd` method with prime number inputs.
23. arrayTestSumArrayEmpty: Tests the `sumArray` method with an empty input array.
24. arrayTestPositiveNumbers: Tests the `sumArray` method with an array of positive integers.
25. arrayTestMixedNumbers: Tests the `sumArray` method with an array of mixed (positive and negative) integers.
26. testMaxArrayBasic: Tests the `maxArray` method with an array of positive integers.
27. testMaxArrayNegativeNumbers: Tests the `maxArray` method with an array of negative integers.
28. testMaxArraySingleElement: Tests the `maxArray` method with an array containing a single element.
29. testMaxArrayWithDuplicates: Tests the `maxArray` method with an array containing duplicate elements.
30. testAverageNormalCase: Tests the `averageArray` method with an array of positive integers.
31. testAverageSingleElement: Tests the `averageArray` method with an array containing a single element.
32. testAverageEmptyArray: Tests that the `averageArray` method throws an `IllegalArgumentException` with an empty input array.
33. testMedianEmptyArray: Tests that the `medianArray` method throws an `IllegalArgumentException` with an empty input array.
34. testMedianNormalOddCase: Tests the `medianArray` method with an array of odd length.
35. testMedianNormalEvenCase: Tests the `medianArray` method with an array of even length.
36. testMedianSingleElement: Tests the `medianArray` method with an array containing a single element.
37. testMedianArrayWithNegativeNumbers: Tests the `medianArray` method with an array containing negative integers.
38. testPrimeZeroOrOne: Tests the `isPrime` method with the inputs 0 and 1.
39. testSmallPrimes: Tests the `isPrime` method with small prime numbers.
40. testSmallNonPrimes: Tests the `isPrime` method with small non-prime numbers.
41. testPrimeNegativeNumbers: Tests the `isPrime` method with negative integers.
42. testLargePrimes: Tests the `isPrime` method with large prime numbers.
43. testLargeNonPrimes: Tests the `isPrime` method with large non-prime numbers.
44. testPrimeSquares: Tests the `isPrime` method with perfect squares.

Usage
To use this repository and run the tests, follow these steps:

Prerequisites
1. Download and install JDK (version 17 recommended).
2. Set the environment variable for the JDK.

Running the Tests
1. Clone the repository:
    ```bash
    git clone https://github.com/fikre4444/junit
    cd junit
    ```
2. Compile the test file with the necessary JUnit and Hamcrest libraries:
    ```bash
    javac -cp ".;junit-4.13.2.jar" CalcTest.java
    ```
3. Run the tests:
    ```bash
    java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar;" org.junit.runner.JUnitCore CalcTest
    ```
After running these commands, you will see the results of the tests, indicating which tests have passed and which have failed.

Contributors
This repository is a result of collaborative efforts with contributions from the following individuals:
1. Dagem Getu
2. Danay Hayelom
3. Fikre Tesfay
4. Measho Abrha
5. Mubarek Mohammed 
Each contributor has helped in fixing issues, creating methods, and developing test cases as part of an open-source collaboration model.

Contributing
To contribute to this repository, follow these steps:
1. Fork the repository to your own GitHub account.
2. Clone your forked repository to your local machine.
3. Create a new branch for your changes.
4. Make your changes and commit them with descriptive messages.
5. Push your changes to your forked repository.
6. Create a pull request to the main repository with a description of your changes.

## Credits
We have utilized the following packages for testing purposes:
- JUnit (junit-4.13.2.jar)
- Hamcrest (hamcrest-core-1.3.jar)

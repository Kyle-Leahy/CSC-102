package Lab5;

/**
 * This class contains all methods for successfully completing Lab 5.
 * @author Bjork / Kyle Leahy
 * @version 2.0
 */
public class NumericalUtility {
    /**
     * Method to calculate a factorial from input.
     * @param f The number received that will be turned into a factorial.
     * @return The factorial of input 'f'.
     */
    public static long getFactorial(int f){
        if (f == 0 || f == 1) {return 1;}
        else {
            return f * getFactorial(f - 1);
        }
    }

    /**
     * Method to create a number from a base and exponent.
     * @param n The base of the exponent to be made.
     * @param m The exponent to the base.
     * @return The exponent of input 'n' to the power of 'm'.
     */
    public static int getNPowerM(int n, int m) {
        if (m == 0){return 1;}
        else {
            return n * getNPowerM(n,m-1);
        }
    }

    /**
     * Method to calculate a summation of all integers up to input 'sum'.
     * @param sum The number to be summated.
     * @return The sum of all numbers leading up to and including input 'sum'.
     */
    public static int getSummation(int sum){
        if (sum == 0){return 0;}
        else if (sum == 1){return 1;}
        else {return sum + getSummation(sum - 1);}
    }

    /**
     * Method to find the
     * @param first First number to have the second one compared to.
     * @param second Second number allowing the comparison to be calculated.
     * @return The highest number that can be divided into both 'first' and 'second'.
     */
    public static int getGCD(int first, int second){
        if (second == 0){return first;} //Knew the base case but did some research on getGCD, I was doing LCD at first.
        else {
            return getGCD(second, first % second); // Euclidean Algorithm
        }
    }

    /**
     * Method to calculate the number of the Fibonacci sequence at a given input.
     * @param fib The number input to have a fibonacci sequence returned.
     * @return The fibonacci sequence up to that number e.g. 6 = 8->(5 + 3).
     */
    public static long getFIB(int fib){
        if (fib <= 2) {return 1;}
        else {
            return getFIB(fib - 1) + getFIB(fib - 2);
        }
    }

}
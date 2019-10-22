/**
 * Problem Set 4.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();

        // comment out or uncomment as needed

        //ps.sum();
        //ps.reverse();
        //ps.digits();
        //ps.average();
        //ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     *
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */

    public void sum() {
        int lowerBound;
        int upperBound;
        System.out.println();
        do {
            System.out.print("Lower bound: ");
            lowerBound = in .nextInt();
            System.out.print("Upper bound: ");
            upperBound = in .nextInt();
        } while (lowerBound > upperBound);

        int currentInteger;
        int sum = 0;


        for (currentInteger = lowerBound; currentInteger <= upperBound; currentInteger++) {
            if (currentInteger % 2 == 0) {
                sum += currentInteger;
            }
        }
        System.out.println();
        System.out.printf("%,d", sum);
        System.out.print(".");
        System.out.println();
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */

    public void reverse() {
        int originalNumber;
        String reverseNumber = "";
        System.out.println();
        do {
            System.out.print("Positive integer: ");
            originalNumber = in .nextInt();
        } while (originalNumber <= 0);

        String originalNumberStr = Integer.toString(originalNumber);
        int lastIndexInt = originalNumberStr.length() - 1;



        for (int currentIndex = lastIndexInt; currentIndex >= 0; currentIndex--) {
            reverseNumber += originalNumberStr.substring(currentIndex, currentIndex + 1)+", ";
        }
        reverseNumber = reverseNumber.substring(0, reverseNumber.length() - 2) + ".";
        System.out.println();
        System.out.print(reverseNumber);
        System.out.println();
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */

    public void digits() {
        int positiveInteger;
        int oddSum = 0;
        String currentDigitStr = "";
        int currentDigit;
        System.out.println();
        do {
            System.out.print("Positive integer: ");
            positiveInteger = in .nextInt();
        } while (positiveInteger <= 0);

        String numberString = Integer.toString(positiveInteger);

        for (int currentIndex = 0; currentIndex <= numberString.length() - 1; currentIndex++) {
            currentDigitStr = numberString.substring(currentIndex, currentIndex + 1);

            currentDigit = Integer.parseInt(currentDigitStr);
            if (currentDigit % 2 == 1) {
            oddSum += currentDigit;
            }
        }
        System.out.println();
        System.out.print(oddSum);
        System.out.print(".");
        System.out.println();
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    public void average() {

        double sumOfSeries = 0.00;
        double averageOfSeries;
        double seriesSize = 0.00;
        int numberOfSeries;

        System.out.println();

        do {
            System.out.print("Non-negative integer: ");
            numberOfSeries = in .nextInt();
            if (numberOfSeries > 0) {
                sumOfSeries += numberOfSeries;
                seriesSize++;
            }
        } while (numberOfSeries > 0 || seriesSize == 0);

        averageOfSeries = Math.round((sumOfSeries / seriesSize) * 100.00) /  100.00;

        System.out.println();
        System.out.printf("%,.2f", averageOfSeries);
        System.out.print(".\n");
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

    public void prime() {
        int primeOrNot = 0;
        String primeStatus = "Prime.";

        System.out.println();
        do {
            System.out.print("Non-negative integer: ");
            primeOrNot = in .nextInt();
        } while (primeOrNot < 0);

        for (int i = primeOrNot - 1; i > 1; i--) {
            if (primeOrNot % i == 0)  {
                primeStatus = "Not prime.";
            }
        }

        System.out.println();
        System.out.print(primeStatus);
        System.out.println();



    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    public void fibonacci() {
        int nf = 0;
        int n1 = 0;
        int n2 = 1;

        int fibonacci = 0;

        System.out.println();
        do {
            System.out.print("Positive integer: ");
            nf = in .nextInt();
        } while (nf < 1 || nf > 92);
        for (int i = 1; i <= nf; i++) {

            ni =  n1 + n2;
            n1  = n2;
            n2 = nf;

        }

        System.out.println();
        System.out.print(fibonacci);
        System.out.println();

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    public void factors() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    public void mario() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {

    }
}

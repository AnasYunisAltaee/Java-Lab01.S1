import java.util.Scanner;

public class Exercises {

    // Exercise 2-1
    public static int sign(double x) {
        if (x > 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    // Exercise 2-2
    public static int collatzNumber(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    // Exercise 2-3
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    // Exercise 2-4
    public static void printFizzBuzz(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (x % 3 == 0) {
            System.out.println("Fizz");
        } else if (x % 5 == 0) {
            System.out.println("Buzz");
        }
    }

    public static void go() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        int i = scanner.nextInt();
        printFizzBuzz(i);
    }

    // Exercise 2-5
    public static void triangle1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Exercise 2-6
    public static int euler(int n) {
        int squareOfSum = 0;
        int sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }
        squareOfSum *= squareOfSum;
        return squareOfSum - sumOfSquares;
    }

    public static void problem6() {
        int sumOfSquares = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            sumOfSquares += i * i;
        }
        int squareOfSum = sum * sum;
        int difference = squareOfSum - sumOfSquares;
        System.out.println("The difference is " + difference);
    }

    // Exercise 2-7
    public static void bottlesOfBeer() {
        for (int i = 99; i > 0; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
            } else {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.\n");
            }
        }
    }

    public static void main(String[] args) {
        // Hier kannst du die Methoden aufrufen und testen, z. B.:
        // go();
        // triangle1(5);
        // System.out.println(sign(-5.4));
        // System.out.println(euler(100));
        // bottlesOfBeer();
    }
}

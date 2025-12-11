import java.util.Scanner;
public class Question6 {

    //  Fibonacci using iteration --------->>>>>>>>
    public static void fibonacciIterative(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci using iteration: ");

        while (a <= n) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    //  Fibonacci using recursion --------->>>>>>>
    public static int fibonacciRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void fibonacciPrintRecursive(int limit) {
        System.out.print("Fibonacci using recursion): ");
        int i = 0;

        while (true) {
            int value = fibonacciRecursive(i);

            if (value > limit) {
                break;
            }

            System.out.print(value + " ");
            i++;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        fibonacciIterative(n);
        fibonacciPrintRecursive(n);
    }
}

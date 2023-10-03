//Fibanasis series upto n terms in java?

import java.util.*;

public class Fibanosis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        //int n = 10; // number of terms to print
        int[] fib = new int[n]; // array to store the Fibonacci series
        fib[0] = 0; // first term
        fib[1] = 1; // second term

        // compute the Fibonacci series using a recursive function
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        // print the Fibonacci series
        System.out.print("Fibonacci series upto " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
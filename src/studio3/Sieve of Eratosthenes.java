package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        System.out.println("Prime numbers up to " + n + " are:");
        sieveOfEratosthenes(n);
    }

// Prints all prime numbers smaller than or equal to n
    public static void sieveOfEratosthenes(int n) {
        if (n < 2) {
            System.out.println("No primes <= " + n);
            return;
        }

        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        prime[0] = false;
        prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

}
}

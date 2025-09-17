package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
        System.out.println("Primes up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}



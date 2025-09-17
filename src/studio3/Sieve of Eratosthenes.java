
public static void main(String[] args) {
    int n = 40; 
    System.out.println("Number of primes up to " + n + " is: " + sieveOfEratosthenes(n));


if (n >= 2) {
boolean prime[] = new boolean[n + 1];
for (int i = 0; i <= n; i++)
    prime[i] = true;
for (int p = 2; p * p <= n; p++) {
    if (prime[p] == true) {
        for (int i = p * p; i <= n; i += p)
            prime[i] = false;
           
}
}
int count = 0;
for (int p = 2; p <= n; p++) {
    if (prime[p]) {
        count++;
    }
}
}
}
    else {
        System.out.println("There are no prime numbers less than 2.");
    }

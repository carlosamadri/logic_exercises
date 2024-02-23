package SA_LPD8;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Enter 10 numbers of your choice:");

    int[] a = new int[10];
    for(int i = 0; i < 10; i++) {
        a[i] = scanner.nextInt();
    }
    for (int i = 0; i < 10; i++) {
        System.out.println(i + " - " + a[i]);
    }

    int[] primes = new int[10];
    int[] nonPrimes = new int[10];
    int primeNumbers = 0;
    int nonPrimesNumbers = 0;

    for (int i = 0; i < 10; i++) {
        if (isPrime(a[i])) {
            primes[primeNumbers++] = a[i];
        } else {
            nonPrimes[nonPrimesNumbers++] = a[i];
        }
    }
    for (int i = 0; i < primeNumbers; i++) {
        System.out.println(i + " - " + primes[i]);
    }
    for (int i = 0; i < nonPrimesNumbers; i++) {
        System.out.println(i + " - " + nonPrimes[i]);
    }
}
private static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
}

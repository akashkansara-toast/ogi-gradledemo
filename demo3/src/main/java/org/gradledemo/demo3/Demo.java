package org.gradledemo.demo3;

import org.apache.commons.math3.primes.Primes;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World from Demo3!");
        System.out.printf("Q: Is 3 a prime no? A: %s\n", Primes.isPrime(3) ? "Y" : "N");
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        /*
            Create a method that takes an int and checks if the number is a prime number.
            A prime number is a number that's only divisible by 1 and itself. If it's prime, return true.
            Otherwise return false.
        */
        System.out.println(checkIfPrimeNum(5));
    }

    public static boolean checkIfPrimeNum(int primNum) {
        for (int i = 5; i < 10; i++) {
            if (i % 1 == 0) {
                return true;
            }
        }
        return false;
    }
}

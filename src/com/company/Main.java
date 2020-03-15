package com.company;

public class Main {

    public static void main(String[] args) {
        /*
            Create a method that takes an int and checks if the number is a prime number.
            A prime number is a number that's only divisible by 1 and itself. If it's prime, return true.
            Otherwise return false.
        */
        /*
            1. Change your for loop to this: (int i = 2; i < primNum; i++) Remember, a prime number is a number
            that is divisible only by 1 and itself.
            Therefore, you want to check, if it's divisible by any number between 2 and itself.
            2. Change your if block based on the above.
        */
        System.out.println(checkIfPrimeNum(5));
    }

    public static boolean checkIfPrimeNum(int primNum) {
        for (int i = 2; i < primNum; i++) {
            if (i % 2 == 2) {
                return true;
            }
        }
        return false;
    }
}

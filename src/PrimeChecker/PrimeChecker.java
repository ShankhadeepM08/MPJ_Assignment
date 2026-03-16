package PrimeChecker;

import java.util.Scanner;

public class PrimeChecker {


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();


        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }


        System.out.println("Next 5 prime numbers are:");

        int count = 0;
        int nextNumber = number + 1;

        while (count < 5) {
            if (isPrime(nextNumber)) {
                System.out.println(nextNumber);
                count++;
            }
            nextNumber++;
        }

        sc.close();
    }
}
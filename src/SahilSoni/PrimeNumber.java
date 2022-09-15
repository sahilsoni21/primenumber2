//java program to check a number is prime or not
package SahilSoni;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int number, count = 0;
        System.out.print("Enter a number: ");
        number = object.nextInt();
        for (int index = 1; index <= number; index++) {
            if (number % index == 0)
                count++;
        }
        if (count == 2)
            System.out.println(number + "is a prime number");
        else
            System.out.println(number + "is not a prime number");
    }
}

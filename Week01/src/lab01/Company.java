package lab01;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter 4 digit number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int encrypted = 0;
        int d1 = number % 10;
        number /= 10;
        d1 = (d1 + 7) % 10;
        int d2 = number % 10;
        number /= 10;
        d2 = (d2 + 7) % 10;
        int d3 = number % 10;
        number /= 10;
        d3 = (d3 + 7) % 10;
        int d4 = number % 10;
        number /= 10;
        d4 = (d4 + 7) % 10;

        encrypted = encrypted * 10 + d2;
        encrypted = encrypted * 10 + d1;
        encrypted = encrypted * 10 + d4;
        encrypted = encrypted * 10 + d3;

        number = encrypted;
        System.out.println(number);

    }
}

package lab01;

import java.util.Scanner;

public class FiveDigNum {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter 5 digit number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if(number > 9999 && number < 100000)
        {
            int originalNumber = number;
            int d5 = number % 10;
            number /= 10;
            int d4 = number % 10;
            number /= 10;
            int d3 = number % 10;
            number /= 10;
            int d2 = number % 10;
            number /= 10;
            int d1 = number % 10;
            number /= 10;

            String resultString;
            if(d1 == d5 && d2 == d4)
            {
                resultString = "Palindrome";
            }
            else {
                resultString="Not Palindrome";
            }

            System.out.println(resultString);
        }
        else
        {
            System.out.println("Input is not 5 digit number");
        }
    }

}




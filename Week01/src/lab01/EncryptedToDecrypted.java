package lab01;

import java.util.Scanner;

public class EncryptedToDecrypted {
    public static void main(String[] args) {
        System.out.println("Enter encrypted number: ");
        Scanner input = new Scanner(System.in);
        int encrypted;
        encrypted = input.nextInt();
        int d1 = encrypted % 10;
        encrypted /= 10;
        if(d1 - 7 < 0)
        {
            d1 = (d1 - 7) + 10;
        }
        else {
            d1 = (d1 - 7) % 10;
        }
        int d2 = encrypted % 10;
        encrypted /= 10;
        if(d2 - 7 < 0)
        {
            d2 = (d2 - 7) + 10;
        }
        else {
            d2 = (d2 - 7) % 10;
        }
        int d3 = encrypted % 10;
        encrypted /= 10;
        if(d3 - 7 < 0)
        {
            d3 = (d3 - 7) + 10;
        }
        else {
            d3 = (d3 - 7) % 10;
        }
        int d4 = encrypted % 10;
        encrypted /= 10;
        if(d4 - 7 < 0)
        {
            d4 = (d4 - 7) + 10;
        }
        else {
            d4 = (d4 - 7) % 10;
        }

        int decrypted=0;
        decrypted = decrypted * 10 + d2;
        decrypted = decrypted * 10 + d1;
        decrypted = decrypted * 10 + d4;
        decrypted = decrypted * 10 + d3;
        System.out.println(decrypted);

    }
}

package Numbers;

import java.util.Scanner;

public class Palindrome {

    int a, no, b, temp = 0;

    public Palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        no = scanner.nextInt();
        b = no;
        while (no > 0){
            a = no % 10;
            no = no / 10;
            temp = temp * 10 + a;
        } if (temp==b) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

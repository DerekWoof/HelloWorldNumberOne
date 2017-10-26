package Help;

import java.util.Scanner;

public class Factorial {
    int no, fect = 1;

    public Factorial() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        no = scanner.nextInt();
        for (int i = 1; i < no; i++) {
            fect = fect * i;
        }
        System.out.println("Factorial is :" + fect);
    }
}

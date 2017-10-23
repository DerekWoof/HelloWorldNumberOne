package Printing;

import java.util.Scanner;

public class PrimeNumber {
    public PrimeNumber() {
        int no, i, fectt = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter anhy number :");
        no = scanner.nextInt();
        if (no == 1) {
            System.out.println("Smallest Prime number is 2");
        }
        for (i = 2; i <  no; i++) {
            if (no%i == 0) {
                System.out.println("Not prime");
                break;
            }
        }
        if (no == i) {
            System.out.println("Prime");
        }
    }
}

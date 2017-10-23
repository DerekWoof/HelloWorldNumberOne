package Printing;

import java.util.Scanner;

public class MultiplicationTable {
    public MultiplicationTable() {
        int i, no, table = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        no = scanner.nextInt();
        for (i = 1; i <= 10 ; i++) {
            table = no * i;
            System.out.println(table);
        }
    }
}

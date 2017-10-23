package Help;

import java.util.Scanner;

public class OddEven {

    public int no;

    Scanner s = new Scanner(System.in);

    public OddEven() {
        System.out.println("Enter Any Number :");
        no = s.nextInt();
        if (no % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}

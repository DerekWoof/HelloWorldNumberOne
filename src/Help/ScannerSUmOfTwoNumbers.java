package Help;



import java.util.Scanner;

public class ScannerSUmOfTwoNumbers {
    public int a, b, c=0;

    Scanner s = new Scanner(System.in);

    public ScannerSUmOfTwoNumbers(){
        System.out.println("Enter any two number :");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("Sum: " + c);
    }

}

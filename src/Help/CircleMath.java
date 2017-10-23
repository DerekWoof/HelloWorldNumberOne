package Help;

import java.util.Scanner;

public class CircleMath {
    static Scanner scanner = new Scanner(System.in);
    public CircleMath () {
        System.out.println("Enter the radius:");

        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Area of Circle is:" + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Circumference of the circle is:" + circumference);
    }
}

package Printing;

import java.util.Random;

public class GenerateRandomNumber {
    public GenerateRandomNumber() {
        int counter;
        Random random = new Random();
        System.out.println("Random Numbers");
        System.out.println("**************");
        for (counter = 1; counter <= 5 ; counter++) {
            System.out.println(random.nextInt(200));
        }
    }
}

package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner milesDrivenInput = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Integer milesDriven = milesDrivenInput.nextInt();

        Scanner gasUsedInput = new Scanner(System.in);
        System.out.println("How much gas have you used (in gallons)?");
        Integer gasUsed = gasUsedInput.nextInt();

        System.out.println("Your vehicle gets " + (milesDriven/gasUsed) + " miles-per-gallon");

        milesDrivenInput.close();
        gasUsedInput.close();
    }
}

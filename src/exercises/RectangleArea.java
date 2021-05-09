package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner lengthInput = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Integer length = lengthInput.nextInt();

        Scanner widthInput = new Scanner(System.in);
        System.out.println("What is the width of the rectangle?");
        Integer width = widthInput.nextInt();

        System.out.println("Your rectangle has an area of " + (length*width));

        lengthInput.close();
        widthInput.close();
    }
}

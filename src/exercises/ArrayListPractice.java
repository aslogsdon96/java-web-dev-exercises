package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);

            for (int i = 0; i < numberList.size(); i++)
                if (numberList.get(i) % 2 == 0) {
                    System.out.println(numberList.get(i));
                }

        ArrayList<String> stringList = new ArrayList<>();
            stringList.add("hello");
            stringList.add("television");
            stringList.add("whale");
            stringList.add("fan");
            stringList.add("plant");
            stringList.add("grape");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length you wish to search for:");
        Integer wordLength = input.nextInt();

        for (int i = 0; i < stringList.size(); i++)
            if (stringList.get(i).length() == wordLength) {
                System.out.println(stringList.get(i));
            }
    }
}

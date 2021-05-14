package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int array[] = new int[]{1,1,2,3,5,8};
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
            String[] arrOfStr = str.split("\\.");
        System.out.println(Arrays.toString(arrOfStr));
    }
}

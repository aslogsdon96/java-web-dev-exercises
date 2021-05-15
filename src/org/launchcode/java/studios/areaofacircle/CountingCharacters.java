package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String string = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";
        char [] charArray = string.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char character : charArray) {
            charCount.put(character, charCount.getOrDefault(character, 0) + 1);
        }

        for (Map.Entry<Character, Integer> count : charCount.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}

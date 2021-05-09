package exercises;

import java.util.Scanner;

public class AliceSearchExtended {
    public static void main(String[] args) {
        String searchText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations on it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word you wish to search for:");
        String searchTerm = input.nextLine();

        Integer searchFoundIndex = searchText.indexOf(searchTerm);
        Integer searchFoundLength = searchTerm.length();
        System.out.println("Index of term: " + searchFoundIndex);
        System.out.println("Length of term: " + searchFoundLength);

        Integer searchTextLength = searchText.length();
        String updatedText = searchText.substring(0,searchFoundIndex) + searchText.substring((searchFoundIndex + searchFoundLength), searchTextLength);
        System.out.println(updatedText);

    }
}

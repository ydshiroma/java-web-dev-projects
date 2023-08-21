package org.launchcode;
import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String lowerCase = firstSentence.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search for: ");
        String word = input.nextLine().toLowerCase();
        boolean containsWord = lowerCase.contains(word);
        System.out.println(containsWord);
        int index = lowerCase.indexOf(word);
        int length = word.length();
        System.out.println("Index: " + index);
        System.out.println("Length: " + length);
        String removeWord = firstSentence.substring(0,index) + firstSentence.substring(index + length);
        System.out.println(removeWord);

    }
}

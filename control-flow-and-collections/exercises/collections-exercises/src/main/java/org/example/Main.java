package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//         Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int[] randomNumbers = {1, 1, 2, 3, 5, 8};
        System.out.println("randomNumbers:");
        System.out.println(randomNumbers);

        for (int i : randomNumbers) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        System.out.println(greenEggs);
        String[] greenEggsArray = greenEggs.split(" ");
        System.out.println(Arrays.toString(greenEggsArray));

        String[] greenEggsSentences = greenEggs.split("\\.");
        System.out.println("green eggs sentences: " + Arrays.toString(greenEggsSentences));


        ArrayList<Integer> randomInts = new ArrayList<>();
        randomInts.add(1);
        randomInts.add(5);
        randomInts.add(42);
        randomInts.add(3);
        randomInts.add(8);
        randomInts.add(730);
        randomInts.add(100);
        randomInts.add(0);
        randomInts.add(12);
        randomInts.add(19);
        System.out.println(randomInts);

        System.out.println(sumEven(randomInts));

        ArrayList<String> words = new ArrayList<>();
        words.add("words");
        words.add("cat");
        words.add("banjo");
        System.out.println(words);

        printFiveLetters(words);
        printNumLetters(words);

//        HashMapGradeBook();

    }

    public static int sumEven(ArrayList<Integer> arr) {
        System.out.println("method runs");
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printFiveLetters(ArrayList<String> arr) {
        for (String word : arr) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

    public static void printNumLetters(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of characters to search for: ");
        int numCharacters = input.nextInt();
        for (String word : arr) {
            if (word.length() == numCharacters) {
                System.out.println(word);
            }
        }
        input.close();
    }
}
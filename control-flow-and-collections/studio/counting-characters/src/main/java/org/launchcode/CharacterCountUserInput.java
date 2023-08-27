package org.launchcode;

import java.util.*;

public class CharacterCountUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String str = input.nextLine();
        input.close();

        char[] charactersInString = str.toCharArray();
//        System.out.println(charactersInString[0]);

        ArrayList<Character> uniqueCharacters = new ArrayList<>();

        for (char i : charactersInString) {
            if (!uniqueCharacters.contains(i)) {
                uniqueCharacters.add(i);
            }
//            if uniqueCharacters does not include
//            add to unique characters
        }

//        System.out.println(uniqueCharacters);
        Collections.sort(uniqueCharacters);
//        System.out.println(uniqueCharacters);

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        for (Character i : uniqueCharacters) {
            int numCharacter = 0;
            for (char j : charactersInString) {
                if (i == j) {
                    numCharacter += 1;
                }
            }
            characterCounts.put(i, numCharacter);
        }

//        System.out.println(characterCounts);

        for (Map.Entry<Character, Integer> character : characterCounts.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}

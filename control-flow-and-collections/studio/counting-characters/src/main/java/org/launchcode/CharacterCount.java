package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = str.toCharArray();
        System.out.println(charactersInString[0]);

        ArrayList<Character> uniqueCharacters = new ArrayList<>();

        for (char i : charactersInString) {
            if (!uniqueCharacters.contains(i)) {
                uniqueCharacters.add(i);
            }
//            if uniqueCharacters does not include
//            add to unique characters
        }

        System.out.println(uniqueCharacters);
        Collections.sort(uniqueCharacters);
        System.out.println(uniqueCharacters);

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

//        loop through hashmap
//        print key: value
    }
}

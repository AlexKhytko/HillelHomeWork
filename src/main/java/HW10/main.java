package HW10;

import javax.print.DocFlavor;
import java.util.*;
import java.lang.Integer;

public class main {
    public static void main(String[] args) {
        String word = Arrays.toString(args);

     //   String word = "Load up on guns, bring your friends";
        word = word.toLowerCase().replaceAll("\\s", "");

        Map<Character, Integer> letterCounts = new HashMap<>();


        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letterCounts.containsKey(letter)) {
                letterCounts.put(letter, letterCounts.get(letter) + 1);
            } else {
                letterCounts.put(letter, 1);
            }
        }

        // Выводим результаты
        System.out.println("Number of identical letters in a sentence \"" + word + "\":");
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}

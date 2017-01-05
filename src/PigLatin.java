import java.util.Scanner;
import java.util.Objects;

/**
 * Created by JustinReich on 1/5/17.
 */
public class PigLatin {
    public static void main(String[] args) {
        // Pig Latin Program

        String continueApp = "y";

        while (continueApp.equals("y")) {

            int lowestVowelIndex = 10;
            String translatedInput = null;
            char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
            char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

            // take string input from user
            String userInput;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word to translate to Pig Latin: ");
            userInput = sc.next();

            // retrieves the index of the first vowel
            for (int i = 0; i < vowels.length; i++) {
                int currentVowelIndex = userInput.indexOf(vowels[i]);
                if (currentVowelIndex > -1 && currentVowelIndex < lowestVowelIndex) {
                    lowestVowelIndex = currentVowelIndex;
                }
            }

            // store certain value of translated word based on lowestVowelIndex position
            if (lowestVowelIndex > 0 && lowestVowelIndex < 10) {
                translatedInput = userInput.substring(lowestVowelIndex, userInput.length()) + userInput.substring(0, lowestVowelIndex) + "ay";
            } else {
                translatedInput = userInput + "way";
            }

            for (int i = 0; i < digits.length; i++) {
                if (userInput.indexOf(digits[i]) != -1) {
                    translatedInput = userInput;
                    break;
                }
            }

            // print output
            System.out.println(translatedInput);

            System.out.print("Do you want to enter another word (y/n)? ");
            continueApp = sc.next().toLowerCase();

        }
        System.out.println("Loop is ended.");
    }
}

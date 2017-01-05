import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // INTRO
        //System.out.println("Hello World!");


        // 5.1 - Syntax and Types
        /*
        byte byteNumber = 2;
        System.out.println(byteNumber);

        short shortNumber = 300;
        System.out.println(shortNumber);

        int intNumber = 50000;
        System.out.println(intNumber);

        long longNumber = 43912347821347529L;
        System.out.printf("%,d\n",longNumber);

        float floatNumber = (float) 4.39;
        System.out.println(floatNumber);

        double doubleNumber = 4.1289252858987273894783928738491;
        System.out.println(doubleNumber);

        char charThing = 'j';
        System.out.println(charThing);

        intNumber = 'h';
        System.out.println(intNumber);

        //int class = 34;

        //int nullNumber;
        //System.out.println(nullNumber);
        */


        // 5.2 - Console I / O
        /*

        int userInput;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        userInput = sc.nextInt();

        System.out.println("You entered: " + userInput);

        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        userInput = sc.next();

        System.out.println("You entered: " + userInput);

        String userInput1;
        String userInput2;
        String userInput3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        userInput1 = sc.next();

        System.out.print("Please enter a second word: ");
        userInput2 = sc.next();

        System.out.print("Please enter a third word: ");
        userInput3 = sc.next();

        System.out.println("You entered: " + userInput1 + " and " + userInput2 + " and finally " + userInput3);

        System.out.println("\nWelcome to the geometric calculator!");
        System.out.println("I can calculate the parameter, area, and volume of a room.");
        System.out.println("All input and output will be calculated using feet.");

        double length;
        double width;
        double height;
        String response = "yes";

        while (Objects.equals(response, "yes") || Objects.equals(response, "y") || Objects.equals(response, "Y")) {

            Scanner sc = new Scanner(System.in);

            System.out.print("\nPlease enter the room length: ");
            length = sc.nextDouble();

            System.out.print("Please enter the room width: ");
            width = sc.nextDouble();

            System.out.print("Please enter the room height: ");
            height = sc.nextDouble();

            System.out.println("The parameter of the room is: " + ((length * 2) + (width * 2)) + " feet.");
            System.out.println("The area of the room is: " + width * length + " feet.");
            System.out.println("The volume of the room is: " + width * length * height + " cubic feet.");

            System.out.print("Would you like to calculate another room (please enter 'yes' or 'no')? ");
            response = sc.next();
        */

        // 5.3 - Control Statements

        /*
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }


        int i = 100;
        while (i >= 0 ) {
            System.out.println(i);
            i -= 5;
        }


        int i = 2;

        do {
            System.out.println(i);
            i *= i;
        } while(i < 1000000 && i != 0);


        for (int i = 100; i >= 0; i -=5) {
            System.out.println(i);
        }

        for (int i = 2; i < 1000000 && i != 0; i *= i) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
             if (i % 5 == 0 && i % 3 == 0) {
                 System.out.println("FizzBuzz");
             } else if (i % 3 == 0) {
                 System.out.println("Fizz");
             } else if (i % 5 == 0) {
                 System.out.println("Buzz");
             } else {
                 System.out.println(i);
             }
         }



        int userInput;
        String continueGame = "yes";


        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number:");
            userInput = sc.nextInt();

            for (int i = 1; i <= userInput; i++) {
                System.out.print("\n" + i + " to the power of 2 is " + (i * i));
                System.out.print(" || " + i + " to the power of 3 is " + (i * i * i));
            }

            System.out.println("\n\nWould you like to enter another number?");
            continueGame = sc.next();

        } while (Objects.equals(continueGame, "yes"));



        int userInput;
        String continueGame = "yes";


        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number grade:");
            userInput = sc.nextInt();

            if (userInput <= 60) {
                System.out.println("The letter grade is F");
            } else if (userInput <= 66) {
                System.out.println("The letter grade is D");
            } else if (userInput <= 79) {
                System.out.println("The letter grade is C");
            } else if (userInput <= 87) {
                System.out.println("The letter grade is B");
            } else {
                System.out.println("The letter grade is A");
            }

            System.out.println("\nWould you like to enter another number grade?");
            continueGame = sc.next();

        } while (Objects.equals(continueGame, "yes"));
        */

        // 5.4 - Strings

        /*
        String message = "We don't need no education\n\nWe don't need no thought control";
        System.out.println(message);
        */


        /*
        String message = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message);
        */


        /*
        String message = "In windows, the main drive is usually C:\\";
        System.out.println(message);
        */

        /*
        String message = "I can do back slashes \\, and double back slashes \\\\, and the amazing triple back-slash \\\\\\";
        System.out.println(message);
        */

        // Pig Latin Program

        /*
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


        // for each whitespace occurrence
        // lop off a word by whitespace
        // for the word
        // transform the word
            // check the index of each vowel
            // for the vowel with the lowest index number, if not 0, return a new string with the characters up to that vowel char index moved to the end of the string
                // else if the vowel index is 0, return a new string word with "way" concatenated to the end
        //

        */

        // 5.5 Methods


        // Factorial exercise
        /*
        String continueProgram = "y";

        while (continueProgram.equals("y") || continueProgram.equals("Y")) {

            int userInput;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to from 1 to 20: ");
            userInput = sc.nextInt();

            if (userInput > 0 && userInput < 21) {
                System.out.println(calculateFactorial(userInput));
            } else {
                System.out.println("Input out of range");
            }

            System.out.print("Do you wish to enter another number (y/n)? ");
            continueProgram = sc.next();

        }

        */

        // Dice Exercise
        /*
        int sides;
        String answer;

        System.out.println("Welcome to the dice roller!");
        Scanner sc = new Scanner(System.in);

        System.out.println("How many sided dice should be rolled? ");
        sides = sc.nextInt();

        System.out.println("Do you wish to roll the pair of dice (y/n)? ");
        answer = sc.next();

        if (answer.equals("Y") || answer.equals("y")) {
            int dice1 = rollDice(sides);
            int dice2 = rollDice(sides);
            System.out.println("You rolled a " + dice1 + " and a " + dice2);
        }
        */

        // 5.6 Error and Exceptions



        /*
        String continueProgram = "y";
        int studentQuery;

        System.out.println("Welcome to the Student Database.\n");
        Scanner sc = new Scanner(System.in);

        while (continueProgram.equals("y") || continueProgram.equals("Y")) {

            try {
                System.out.print("Please enter a student ID for info (1 through 5): ");
                studentQuery = sc.nextInt();
                String output = getStudentInfo(studentQuery);
                System.out.println(output);
            } catch (IndexOutOfBoundsException e) {
                sc.nextLine();
                System.out.println("Number entered was out of range.");
            } catch (Exception e) {
                sc.next();
                System.out.println("Invalid input entered. Input must be an integer.");
            }

            System.out.print("Would you like to look up another student (y/n): ");
            continueProgram = sc.next();
        }

        */


        // ValidatorTestApp.runTests();

        GuessingGame gg = new GuessingGame(1, 100);
        gg.runGame();



    }

    /*
    public static double addNumbers(double o1, double o2) {
        return o1 + o2;
    }

    public static double subtractNumbers(double o1, double o2) {
        return o1 - o2;
    }

    public static double multiplyNumbers(double o1, double o2) {
        return o1 * o2;
    }

    public static double divideNumbers(double o1, double o2) {
        return o1 / o2;
    }

    public static double modNumbers(double o1, double o2) {
        return o1 % o2;
    }


    public static long calculateFactorial(int o1) {
        long result = 1;
        for (int i = 1; i <= o1 ; i++) {
            result *= i;
        }
        return result;
    }


    // Recursive Solution
    public static long calculateFactorial(int o1) {
        long result = 1;
        if (o1 == 1) {
            return result;
        } else {
            return o1 * calculateFactorial(o1 -1);
        }
    }

    public static int rollDice(int sidesOfDice) {
        return (int)(Math.random() * sidesOfDice - 1) + 1;
    }

    */


    // 5.6

    /*
    public static String getStudentInfo(int id) {
        String[] studentNames = {"John", "Justin", "Pam", "Ron", "George"};
        int[] studentAges = {25, 31, 29, 18, 28};
        String[] studentDOB = {"March 12", "August 12", "May 4", "April 5", "June 2"};
        String query = "\n" + studentNames[id -1] + " is " + studentAges[id -1] + " and was born on " + studentDOB[id -1] + ".\n";
        return query;

    }

    */




}

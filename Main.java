import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);                             // asks for user input to process in following program
        System.out.println("geef input:\t");
        String input = inputText.nextLine().toLowerCase();                      // eliminates case sensitivity issues

        // Character count
        int length = input.length();                                            // provides length of input in nr of chars
        System.out.println(length + " characters.");

        // Word count
        int words = input.split(" ").length;                                    // provides number of words, definition of word is "split by space char"
        System.out.println(words + " words.");

        // Vowel count
        int klinkers = 0;                                                       // provides number of vowels, looping through input and adding to the counter
        char [] preTemp = input.toCharArray();
        for (char i : preTemp) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'y') {
                klinkers++;
            }
        }
        System.out.println(klinkers + " vowels.");

        // Palindrome check
        char [] reversed = new char[length];                                    // uses input as char array to create its reverse in seperate char array
        int iter = (length-1);
        for (char kar : preTemp) {
            reversed[iter] = kar;
            iter--;
        }

        String compReversed = String.copyValueOf(reversed);                     // provides the reversed input, compares it with input, and outputs whether it is a palindrome
        System.out.println(compReversed + " is the reverse of your input.");

        if (input.equals(compReversed)) {
            System.out.println("This means your input is a palindrome.");
        } else {
            System.out.println("Your input is not a palindrome.");
        }

        // Occurrence
        char [] alphabet = new char[26];                                        // creates alphabet char array for counter usage
        char ascii = 'a';
        for (int ab = 0; ab < alphabet.length; ab++) {
            alphabet[ab] = ascii;
            System.out.print(ascii + "\t|\t");

            for (char i : preTemp) {                                            // for each char in the input, print a * for each occurrence in the input in an alphabetic grid
                if (i == ascii) {
                    System.out.print(" *");
                }
            }
            System.out.println();
            ascii++;
        }




    } // psvMain Exit
} // Main Class Exit

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        System.out.println("geef input:\t");
        String input = inputText.nextLine().toLowerCase();

        // aantal characters
        int length = input.length();
        System.out.println(length + " characters.");

        // aantal woorden
        int words = input.split(" ").length;
        System.out.println(words + " words.");

        // aantal klinkers
        int klinkers = 0;
        for (char i : input.toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'y') {
                klinkers++;
            }
        }
        System.out.println(klinkers + " vowels.");

        // palindroom
        char [] preTemp = input.toCharArray();
        char [] reversed = new char[length];
        int iter = (length-1);
        for (char kar : preTemp) {
            reversed[iter] = kar;
            iter--;
        }

        String compReversed = String.copyValueOf(reversed);
        System.out.println(compReversed + " is the reverse of your input.");

        if (input.equals(compReversed)) {
            System.out.println("This means your input is a palindrome.");
        } else {
            System.out.println("Your input is not a palindrome.");
        }








    }
}

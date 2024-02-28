package practice5;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        String reversedString = reverseWords(originalString);

        System.out.println("The given string is: " + originalString);
        System.out.println("The new string after reversed the words is: " + reversedString);
    }

    public static String reverseWords(String originalString) {
        String[] words = originalString.split("\\s+");

        StringBuilder reversedBuilder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedBuilder.append(words[i]);
            if (i > 0) {
                reversedBuilder.append(" "); 
            }
        }

        return reversedBuilder.toString();
    }
}

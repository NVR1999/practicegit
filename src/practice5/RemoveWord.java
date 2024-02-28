package practice5;

import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the word to remove: ");
        String wordToRemove = scanner.nextLine();

        
        String newText = removeWord(text, wordToRemove);

        System.out.println("New text after removing \"" + wordToRemove + "\": " + newText);
    }

    public static String removeWord(String text, String wordToRemove) {
        
        return text.replace(wordToRemove, "").trim();
    }
}

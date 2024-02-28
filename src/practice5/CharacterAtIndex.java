package practice5;

import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        try {
            char charAtIndex = inputString.charAt(index);
            System.out.println("Character at index " + index + " is: " + charAtIndex);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds for the given string.");
        }
    }
}


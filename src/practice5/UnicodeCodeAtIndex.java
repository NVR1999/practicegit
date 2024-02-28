package practice5;

import java.util.Scanner;

public class UnicodeCodeAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        try {
            int unicodeCodePoint = inputString.codePointAt(index);
            System.out.println("Unicode code point at index " + index + " is: " + unicodeCodePoint);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds for the given string.");
        }
    }
}


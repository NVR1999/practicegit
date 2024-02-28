package practice5;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Original string: ");
        String originalString = scanner.nextLine();

        
        System.out.print("Remove char from given string: ");
        String charToRemove = scanner.nextLine();

       
        String newString = removeCharacter(originalString, charToRemove);

      
        System.out.println("Second string: " + newString);
    }

    public static String removeCharacter(String originalString, String charToRemove) {
        
        return originalString.replace(charToRemove, "");
    }
}


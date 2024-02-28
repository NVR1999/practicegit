package practice5;

import java.util.Scanner;

public class StringContainmentCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Input the second string: ");
        String secondString = scanner.nextLine();

        boolean containsAllLetters = checkContainment(firstString, secondString);
        
        System.out.println("Check first string contains letters from the second string:");
        System.out.println(containsAllLetters);
    }

    public static boolean checkContainment(String firstString, String secondString) {
        for (char c : secondString.toCharArray()) {
            if (firstString.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

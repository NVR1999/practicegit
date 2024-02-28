package practice5;


import java.util.Scanner;

public class RepeatCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        String newString = repeatCharacters(originalString);

        System.out.println("The given string is: " + originalString);
        System.out.println("The new string is: " + newString);
    }

    public static String repeatCharacters(String originalString) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : originalString.toCharArray()) {
            stringBuilder.append(c).append(c);
        }

        return stringBuilder.toString();
    }
}


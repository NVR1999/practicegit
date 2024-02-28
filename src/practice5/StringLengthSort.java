package practice5;

import java.util.Arrays;
import java.util.Comparator;

public class StringLengthSort {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "kiwi", "strawberry"};

        
        Arrays.sort(array, Comparator.comparingInt(String::length));

        
        System.out.println("Ascending order by length:");
        for (String str : array) {
            System.out.println(str);
        }

        Arrays.sort(array, Comparator.comparingInt(String::length).reversed());

        
        System.out.println("\nDescending order by length:");
        for (String str : array) {
            System.out.println(str);
        }
    }
}

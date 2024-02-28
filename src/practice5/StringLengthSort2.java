package practice5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringLengthSort2 {
    public static void main(String[] args) {
        String[] colors = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};

       
        List<String> colorList = Arrays.asList(colors);

        
        colorList.sort(Comparator.comparingInt(String::length).reversed());

        
        System.out.println("Sorted color (descending order): " + colorList);

        
        colorList.sort(Comparator.comparingInt(String::length));

        
        System.out.println("Sorted color (ascending order): " + colorList);
    }
}

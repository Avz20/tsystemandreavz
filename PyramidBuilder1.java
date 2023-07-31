package com.tsystems.javaschool.tasks.pyramid;

import java.util.Arrays;
import java.util.Scanner;

public class PyramidBuilder {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String readDigitsAsUserInput() {
        String stringDigits;
        System.out.print("Enter a list of numbers: ");
        stringDigits = scanner.nextLine();
        return stringDigits;
    }
     
    public static int[] createArrayOfDigits(String stringDigits) {
        int[] digits = Arrays.stream(stringDigits.split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(digits);
        return digits;
    }
     
    public static void displayPyramid(int[] digits) {
        int marginLeft;
        for(int i = 1; i < digits.length; i++) {
            marginLeft = digits.length - i;
            for(int j = 0; j < marginLeft; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(digits[i-1]);
            }
            for(int j = 0; j < i-1; j++) {
                System.out.print(digits[i-1]);
            }
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        String stringDigits;
        int[] digits;
         
        stringDigits = readDigitsAsUserInput();
        digits = createArrayOfDigits(stringDigits);
        displayPyramid(digits);
    }
}
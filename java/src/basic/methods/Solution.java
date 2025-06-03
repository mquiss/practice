package basic.methods;

import java.util.Scanner;

public class Solution {

    public int findSmallestNumber(int quantity, Scanner scanner) {
        int smallestNumber;

        System.out.print("Enter 1 number: ");
        smallestNumber = scanner.nextInt();

        for (int i = 1; i < quantity; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            int scannedNumber = scanner.nextInt();

            if (scannedNumber < smallestNumber) {
                smallestNumber = scannedNumber;
            }
        }

        return smallestNumber;
    }

    public double calculateAverage(int quantity, Scanner scanner) {
        double sum = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            sum += scanner.nextDouble();
        }

        return sum / quantity;
    }

    public String findMiddleChar(Scanner scanner) {
        System.out.print("Enter a string: ");

        String string = scanner.next();

        boolean isOdd = string.length() % 2 == 0;

        int middlePosition = string.length() / 2;

        return isOdd ?
                string.substring(middlePosition - 1, middlePosition + 1) :
                String.valueOf(string.charAt(middlePosition));
    }

    public int countVowels(Scanner scanner) {
        System.out.print("Enter a string: ");

        String string = scanner.next();

        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            for (char vowel : vowels) {
                if (string.charAt(i) == vowel) {
                    count++;
                }
            }
        }

        return count;
    }

    public int countWords(Scanner scanner) {
        System.out.print("Enter a string: ");

        String string = scanner.nextLine();

        String[] words = string.split(" ");

        return words.length;
    }

    public int sumDigits(Scanner scanner) {
        System.out.print("Enter an integer: ");

        int number = scanner.nextInt();

        int sum = 0;

        char[] digits = Integer.toString(number).toCharArray();

        for (char digit : digits) {
            sum += Integer.parseInt(String.valueOf(digit));
        }

        return sum;
    }


}

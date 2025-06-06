package functional_programming.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    /**
     * Write a Java program to calculate the average of a list of integers using streams.
     * **/
    public double calculateAverage(List<Integer> integerList) {
        return (double) integerList.stream().mapToInt(Integer::intValue).sum() / integerList.size();
    }

    /**
     * Write a Java program to convert a list of strings to uppercase or lowercase using streams.
     * @param type uppercase or lowercase
     * **/
    public List<String> convertCase(String type, List<String> stringList) {
        if (!type.equalsIgnoreCase("UPPERCASE") && !type.equalsIgnoreCase("LOWERCASE")) {
            throw new RuntimeException("Invalid type");
        }

        return type.equals("UPPERCASE") ?
                stringList.stream().map(String::toUpperCase).collect(Collectors.toList()) :
                stringList.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    /**
     * Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
     * @param type odd or even
     * **/
    public int sumByType(String type, List<Integer> integerList) {
        if (!type.equalsIgnoreCase("ODD") && !type.equalsIgnoreCase("EVEN")) {
            throw new RuntimeException("Invalid type");
        }

        return type.equals("ODD") ?
                integerList.stream().filter(number -> number % 2 != 0).mapToInt(Integer::intValue).sum() :
                integerList.stream().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum() ;
    }

    /**
     * Write a Java program to remove all duplicate elements from a list using streams.
     * **/
    public List<String> removeDuplicates(List<String> stringList) {
        return stringList.stream().distinct().collect(Collectors.toList());
    }

    /**
     * Write a Java program to count the number of strings in a list that start with a specific letter using streams.
     * **/
    public int countStringsStartingWith(List<String>stringList, char letter) {
        return stringList.stream().filter(s -> Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(letter)).toList().size();
    }

    /**
     * Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
     * @param direction asd or desc
     **/
    public List<String> alphabeticalSort(List<String> stringList, String direction) {
        if (!direction.equalsIgnoreCase("ASC") && !direction.equalsIgnoreCase("DESC")) {
            throw new RuntimeException("Invalid direction");
        }

        return direction.equalsIgnoreCase("ASC") ?
                stringList.stream().sorted().collect(Collectors.toList()):
                stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    /**
     * Write a Java program to find the maximum and minimum values in a list of integers using streams.
     * @param type max or min
     * **/
    public int findIntegerByType(List<Integer> integerList, String type) {
        if (!type.equalsIgnoreCase("MAX") && !type.equalsIgnoreCase("MIN")) {
            throw new RuntimeException("Invalid type");
        }

        return type.equalsIgnoreCase("MAX")?
                integerList.stream().max(Integer::compare).get() :
                integerList.stream().min(Integer::compare).get() ;
    }

    /**
     * Write a Java program to find the second smallest and largest elements in a list of integers using streams.
     * @param type max or min
     * **/

    public int findSecondIngeterByType(List<Integer> integerList, String type) {
        if (!type.equalsIgnoreCase("MAX") && !type.equalsIgnoreCase("MIN")) {
            throw new RuntimeException("Invalid type");
        }

        return type.equalsIgnoreCase("MIN") ?
                integerList.stream().sorted().toList().get(1) :
                integerList.stream().sorted(Comparator.reverseOrder()).toList().get(1) ;
    }

}

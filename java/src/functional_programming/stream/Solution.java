package functional_programming.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public double calculateAverage(List<Integer> integerList) {
        return (double) integerList.stream().mapToInt(Integer::intValue).sum() / integerList.size();
    }

    /**
     * @param type uppercase or lowercase
     **/
    public List<String> convertCase(String type, List<String> stringList) {
        if (!type.equalsIgnoreCase("UPPERCASE") && !type.equalsIgnoreCase("LOWERCASE")) {
            throw new RuntimeException("Invalid type");
        }

        return type.equals("UPPERCASE") ?
                stringList.stream().map(String::toUpperCase).collect(Collectors.toList()) :
                stringList.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    /**
     * @param  type odd or even
     **/
    public int sumByType(String type, List<Integer> integerList) {
        if (!type.equalsIgnoreCase("ODD") && !type.equalsIgnoreCase("EVEN")) {
            throw new RuntimeException("Invalid type");
        }

        return type.equals("ODD") ?
                integerList.stream().filter(number -> number % 2 != 0).mapToInt(Integer::intValue).sum() :
                integerList.stream().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum();
    }
}

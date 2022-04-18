package baseball.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Utils {

    public static void showMessage(String message) {
        System.out.print(message);
    }

    public static int booleanToInt(Boolean isTrue) {
        if (isTrue) {
            return 1;
        }

        return 0;
    }

    public static List<Integer> stringToIntList(String str) {
        if (str == null) {
            return new ArrayList<>();
        }

        Integer[] intArray = new Integer[str.length()];

        for (int index = 0; index < str.length(); index++) {
            intArray[index] = Character.digit(str.charAt(index), 10);
        }

        return Arrays.asList(intArray);
    }

    public static boolean equalsLength(String str, int length) {
        if (str == null) {
            return false;
        }

        return str.length() == length;
    }

    public static boolean isNumber(String str) {
        if (str == null || str.length() < 1) {
            return false;
        }

        return str.matches("[1-9]+");
    }

    public static boolean validateNumberRange(String str, int range) {
        return str.matches(String.format("[1-9]{%d}", range));
    }

    public static boolean hasNotDuplicateNumber(String str) {
        Set<String> set = new LinkedHashSet<>();
        for (int index = 0; index < str.length(); index++) {
            set.add(String.valueOf(str.charAt(index)));
        }
        return String.join("", set).equals(str);
    }

    public static boolean validateNumber(List<Integer> numbers) {
        String strNumber = numbers.toString().replaceAll("[^0-9]","");
        return validateNumber(strNumber);
    }

    public static boolean validateNumber(String str) {
        if (!Utils.hasNotDuplicateNumber(str)) {
            return false;
        }

        return Utils.isNumber(str)
            && Utils.validateNumberRange(str, Constants.INPUT_NUMBER_LENGTH)
            && Utils.equalsLength(str, Constants.INPUT_NUMBER_LENGTH);
    }
}

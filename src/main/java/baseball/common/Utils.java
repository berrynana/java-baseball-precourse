package baseball.common;

import java.util.LinkedHashSet;
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

    public static String removeDuplicateNumber(String str) {
        Set<String> set = new LinkedHashSet<>();
        for (int index = 0; index < str.length(); index++) {
            set.add(String.valueOf(str.charAt(index)));
        }
        return String.join("", set);
    }

    public static boolean validateNumber(String str) {
        str = Utils.removeDuplicateNumber(str);

        return Utils.isNumber(str)
            && Utils.validateNumberRange(str, Constants.INPUT_NUMBER_LENGTH)
            && Utils.equalsLength(str, Constants.INPUT_NUMBER_LENGTH);
    }
}

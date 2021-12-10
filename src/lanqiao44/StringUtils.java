package lanqiao44;

/**
 * @author Chanmoey
 * @date 2021年12月10日 20:06
 * @description
 */
public class StringUtils {
    public static boolean allIsNotNull(String... s) {
        // TODO
        if (s == null || s.length == 0) {
            return false;
        }

        for (String string : s) {
            if (string == null) {
                return false;
            }
        }

        return true;
    }

    public static boolean allIsNotEmpty(String... s) {
        //TODO
        if (s == null || s.length == 0) {
            return false;
        }

        for (String string : s) {
            if (string == null || "".equals(string)) {
                return false;
            }
        }

        return true;
    }
}

package steps;

import org.apache.commons.lang3.RandomStringUtils;

public class Utils {

    public static String generateIdStartsFrom(String startString, int charactersCount) {
        if (charactersCount <= startString.length()) {
            return startString;
        }
        return startString + RandomStringUtils.random(charactersCount - startString.length() - 1, true, false)
                .concat(RandomStringUtils.random(1, false, true))
                .toLowerCase();
    }

    public static String generateIntValueText(int charactersCount) {
        return RandomStringUtils.random(charactersCount, false, true);
    }
}

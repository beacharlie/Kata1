/*Complete the method/function so that it converts dash/underscore
 *delimited words into camel casing.
 *The first word within the output should be capitalized
 *only if the original word was capitalized (known as Upper Camel Case,
 *also often referred to as Pascal case). The next words should be always capitalized.
 */

public class Solution {
    /**
     * Método que acepta una cadena y la pasa a CamelCase
     *
     * @param String Un string
     * @return una cadena en camel camelCase
     * @example "the-stealth-warrior" gets converted to "theStealthWarrior"
     * <p>
     * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     * <p>
     * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
     */

    public static String toCamelCase(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.split("[-_]");
        if (words.length == 0) {
            return "";
        }

        StringBuilder camelCase = new StringBuilder(words[0]); // Keep first word as is
        for (int i = 1; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                camelCase.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1));
            }
        }
        return camelCase.toString();
    }
}
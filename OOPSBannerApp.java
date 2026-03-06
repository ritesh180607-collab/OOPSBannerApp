import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    static class CharacterPattern {

        private String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
	
    static class CharacterPatternMap {

        private static Map<Character, CharacterPattern> map = new HashMap<>();

        static {

            map.put('O', new CharacterPattern(new String[]{
                    "  ***  ",
                    " *   * ",
                    " *   * ",
                    " *   * ",
                    " *   * ",
                    " *   * ",
                    "  ***  "
            }));

            map.put('P', new CharacterPattern(new String[]{
                    " ****  ",
                    " *   * ",
                    " *   * ",
                    " ****  ",
                    " *     ",
                    " *     ",
                    " *     "
            }));

            map.put('S', new CharacterPattern(new String[]{
                    "  **** ",
                    " *     ",
                    " *     ",
                    "  ***  ",
                    "     * ",
                    "     * ",
                    " ****  "
            }));
        }

        public static CharacterPattern getPattern(char c) {
            return map.get(c);
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(CharacterPatternMap.getPattern(c).getPattern()[row]).append("  ");
            }

            System.out.println(line);

    public static void main(String[] args) {

        String[] banner = {
            "  *****     *****     ******     *****  ",
            " **   **   **   **    **   **    **   ** ",
            "**     **  **     **   **   **    **      ",
            "**     **  **     **   ******      *****  ",
            "**     **  **     **   **              ** ",
            " **   **   **   **    **         **   **  ",
            "  *****     *****     **          *****   "
        };
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String message = "OOPS";
        renderBanner(message);
    }

    public static void initializePatterns() {

        patternMap.put('O', new String[]{
                "  ***  ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                "  ***  "
        });

        patternMap.put('P', new String[]{
                " ****  ",
                " *   * ",
                " *   * ",
                " ****  ",
                " *     ",
                " *     ",
                " *     "
        });

        patternMap.put('S', new String[]{
                "  **** ",
                " *     ",
                " *     ",
                "  ***  ",
                "     * ",
                "     * ",
                " ****  "
        });
    }

    public static String[] getPattern(char c) {
        return patternMap.get(c);
    }

    public static void renderBanner(String text) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            for (char ch : text.toCharArray()) {

                String[] pattern = getPattern(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }

            System.out.println();
        }
    }
}
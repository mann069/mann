// Program Name: OOPSBannerUC8
// Purpose: Display OOPS banner using HashMap for pattern storage

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // Function to initialize character patterns in a HashMap
    public static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int rows = 5;

        // Loop through rows
        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            // Loop through each character in the word
            for (char letter : word.toCharArray()) {

                String[] pattern = patternMap.get(letter);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            // Print the banner row
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Initialize pattern storage
        Map<Character, String[]> patternMap = initializePatterns();

        // Banner word
        String bannerWord = "OOPS";

        // Render banner
        renderBanner(bannerWord, patternMap);
    }
}


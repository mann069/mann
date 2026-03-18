// Program Name: OOPSBannerUC7
// Purpose: Display OOPS banner using CharacterPattern class and pattern mapping

public class OOPSBannerUC7 {

    // Static Inner Class to store character and its pattern
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Creating pattern objects for characters
        CharacterPattern patternO = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern patternP = new CharacterPattern('P', new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        });

        CharacterPattern patternS = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        // Word to display
        String bannerWord = "OOPS";

        // Store patterns in array
        CharacterPattern[] patternMap = {patternO, patternP, patternS};

        int rows = 5;

        // Loop through each row
        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            // Loop through characters in the banner word
            for (int j = 0; j < bannerWord.length(); j++) {

                char currentChar = bannerWord.charAt(j);

                // Find matching pattern
                for (CharacterPattern cp : patternMap) {

                    if (cp.getCharacter() == currentChar) {

                        line.append(cp.getPattern()[i]).append("  ");
                        break;
                    }
                }
            }

            // Print banner row
            System.out.println(line);
        }
    }
}


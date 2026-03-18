// Program Name: OOPSBannerUC6
// Purpose: Generate and display OOPS banner using static helper methods

public class OOPSBannerUC6 {

    // Static method to generate pattern for letter O
    public static String[] generateO() {

        String[] patternO = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        return patternO;
    }

    // Static method to generate pattern for letter P
    public static String[] generateP() {

        String[] patternP = {
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        };

        return patternP;
    }

    // Static method to generate pattern for letter S
    public static String[] generateS() {

        String[] patternS = {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };

        return patternS;
    }

    public static void main(String[] args) {

        // Calling static methods to get patterns
        String[] letterO = generateO();
        String[] letterP = generateP();
        String[] letterS = generateS();

        // Loop to print banner row by row
        for (int i = 0; i < letterO.length; i++) {

            System.out.println(
                    letterO[i] + "  " +
                    letterO[i] + "  " +
                    letterP[i] + "  " +
                    letterS[i]
            );
        }
    }
}


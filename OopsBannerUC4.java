public class OopsBannerUC4 {

    public static void main(String[] args) {

        // Store all banner lines in a String array
        String[] banner = {

                String.join("  ", "OOOOO", "OOOOO", "PPPPP", "SSSSS"),
                String.join("  ", "O   O", "O   O", "P   P", "S"),
                String.join("  ", "O   O", "O   O", "PPPPP", "SSSSS"),
                String.join("  ", "O   O", "O   O", "P", "    S"),
                String.join("  ", "OOOOO", "OOOOO", "P", "SSSSS")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

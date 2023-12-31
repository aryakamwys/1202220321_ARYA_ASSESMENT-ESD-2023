public class KombinasiUsername {

    public static void main(String[] args) {
        String fullName = "Naip Lovyu";

        int Kombinasi = countUsernameCombinations(fullName);

        System.out.println("Jumlah kombinasi username yang mungkin: " + Kombinasi);
    }

    public static int countUsernameCombinations(String fullName) {
        String cleanName = fullName.replaceAll("\\s", "").toLowerCase();

        int Kombinasi = 0;
        int maxLength = Math.min(cleanName.length(), 6);

        for (int length = 1; length <= maxLength; length++) {
            for (int start = 0; start <= cleanName.length() - length; start++) {
                Kombinasi++;
            }
        }

        return Kombinasi;
    }
}

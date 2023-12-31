public class CekPalindrom {

    public static void main(String[] args) {
        checkPalindrome("Angsa ");
        checkPalindrome("KataK ");
        checkPalindrome("kasur empuk ");
        checkPalindrome("Aku Suka Kamu");
        checkPalindrome("Ibu Ratna antar ubi. ");
    }

    public static void checkPalindrome(String input) {
        String cleanedInput = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = cleanedInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - i - 1)) {
                System.out.println(input + " suka blyat");
                return;
            }
        }

        System.out.println(input + " eureeka!");
    }
}
public class Decryption {

    public static void main(String[] args) {
        String encryptedChat = "xfqfr bfmdz\n" +
                "gjxtp lzj rfz ifkyfw jxi snm\n" +
                "gwt, gjxtp qz rfz rfpfs in bfwlty lfp?\n" +
                "fpz xfdfsl pfrz, rfz lfp ofin ufhfwpz\n" +
                "dfsl pnwnr xynhpjw otrtp pz pnhp ifwn lwzu";

        String decryptedChat = decryptChat(encryptedChat);

        System.out.println(decryptedChat);
    }

    public static String decryptChat(String encryptedChat) {
        StringBuilder decryptedText = new StringBuilder();

        for (char c : encryptedChat.toCharArray()) {
            if (Character.isLetter(c)) {
                char decryptedChar = (char) (c - 5);
                if (Character.isLowerCase(c) && decryptedChar < 'a') {
                    decryptedChar = (char) (decryptedChar + 26);
                } else if (Character.isUpperCase(c) && decryptedChar < 'A') {
                    decryptedChar = (char) (decryptedChar + 26);
                }
                decryptedText.append(decryptedChar);
            } else {
                decryptedText.append(c);
            }
        }

        return decryptedText.toString();
    }
}

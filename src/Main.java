public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String s) {
        int leftCount = 0;
        int rightCount = 0;
        for (int i=0; i < s.length();i++) {
            char c = s.charAt(i);
            if (c== ')'){
                rightCount++;
            }
            if (c== '('){
                leftCount++;
            }
            if (rightCount>leftCount){
                return false;
            }

        }
        if (rightCount==leftCount){
            return true;
        }
        return false;
    }


    // 2. reverseInteger
    public static String reverseInteger(int num) {
        return new StringBuilder(String.valueOf(num)).reverse().toString();
    }

    // 3. encryptThis
    public static String encryptThis(String message) {
        String[] words = message.split(" ");
        StringBuilder encryptedMessage = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 1) {
                encryptedMessage.append((int) word.charAt(0));
            } else {
                String encryptedWord = (int) word.charAt(0) + word.charAt(word.length() - 1) +
                        word.substring(2, word.length() - 1) + word.charAt(1);
                encryptedMessage.append(encryptedWord);
            }
            encryptedMessage.append(" ");
        }

        return encryptedMessage.toString().trim();
    }

    // 4. decipherThis

    public static String decipherThis(String message) {
        String[] words = message.split(" ");
        StringBuilder decipheredMessage = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 2) {
                decipheredMessage.append((char) Integer.parseInt(word));
            } else {
                char firstLetter = (char) Integer.parseInt(word.substring(0, word.length() - 3));
                String decipheredWord = firstLetter + word.charAt(word.length() - 1) +
                        word.substring(2, word.length() - 1) + word.charAt(1);
                decipheredMessage.append(decipheredWord);
            }
            decipheredMessage.append(" ");
        }

        return decipheredMessage.toString().trim();
    }
}
public class WordReverser {

    public String reverseWord(String word) {
        if (word == null) {
            return null;
        }
        int length = word.length();
        StringBuilder reversed = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}

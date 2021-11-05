package sorting_the_sentence;

public class Solution {
    public static String sortSentence(String s) {
        String[] words = s.split(" ");

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(Character.getNumericValue(words[i].charAt(words[i].length() - 1)), words[i].substring(0, words[i].length() - 1));
        }

        String[] sorted = new String[words.length];
        for (int i = 1; i <= words.length; i++) {
            sorted[i - 1] = map.get(i);
        }

        return String.join(" ", sorted);
    }
}

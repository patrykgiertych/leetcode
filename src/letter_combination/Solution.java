package letter_combination;

class Solution {
    static Map<Character, String> map = Map.of(
            '2', "abc", '3', "def",
            '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs",
            '8', "tuv", '9', "wxyz");

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return Collections.emptyList();

        List<String> list = new ArrayList<>();
        list.add("");

        for (int x = 0; x < digits.length(); x++) {
            int size = list.size();

            for (int i = 0; i < size; i++) {
                String curr = list.remove(0);
                String chars = map.get(digits.charAt(x));

                for (char ch : chars.toCharArray()) {
                    list.add(curr + Character.toString(ch));
                }
            }
        }
        return list;
    }
}

package palindrome;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        List<Character> num = new ArrayList<>();
        char[] nums = String.valueOf(x).toCharArray();
        for (char i : nums) {
            num.add(i);
        }
        List<Character> reversedNum = new ArrayList<>(num);
        Collections.reverse(reversedNum);
        return num.equals(reversedNum);
    }
}

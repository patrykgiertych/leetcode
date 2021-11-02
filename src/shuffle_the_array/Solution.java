package shuffle_the_array;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        int j = 0;
        for(int i = 0; i < n; i++) {
            shuffled[j] = nums[i];
            shuffled[j + 1] = nums[n + i];

            j += 2;
        }
        return shuffled;
    }
}

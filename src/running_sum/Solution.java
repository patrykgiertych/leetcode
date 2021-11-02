package running_sum;

public class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
        return sums;
    }
}

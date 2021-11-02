package richest_customer;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int large = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (large < sum) {
                large = sum;
            }
        }
        return large;
    }
}

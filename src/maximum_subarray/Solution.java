package maximum_subarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE ;
        int sum = 0 ;
        for(int i=0 ; i<nums.length ; i++){
            if(sum < 0 && nums[i] > sum)
                sum = 0 ;
            sum += nums[i];
            if(sum > max){
                max = sum ;
            }
        }
        return max ;
    }
}

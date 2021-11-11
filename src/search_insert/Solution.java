package search_insert;

class Solution {
    public int binarySearch(int[] nums, int num) {

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while ( left <= right) {
            mid = (left + right) /2;
            if (nums[mid] == num) {
                return mid;
            } else if (num < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return nums[mid] < num ? mid + 1: mid;
    }
}

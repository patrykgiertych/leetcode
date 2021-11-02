package median_of_two_arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            array[i] = nums1[i];
        }
        for (int i = nums1.length; i < nums1.length + nums2.length; i++) {
            array[i] = nums2[i - nums1.length];
        }
        double sum = 0;
        Arrays.sort(array);
        int len = array.length;
        if (len % 2 == 0) {
            sum = (array[len / 2] + array[(len/ 2) - 1]) / 2.0;
            return sum;
        } else {
            return (double) array[len / 2];
        }
}

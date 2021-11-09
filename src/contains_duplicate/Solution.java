package contains_duplicate;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int i : nums) {
            numSet.add(i);
        }

        return !(numSet.size() == nums.length);
    }
}
package permutations;

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0) return result;

        boolean[] used = new boolean[nums.length];
        List<Integer> perm = new ArrayList<>();
        helper(nums, perm, used, result);
        return result;

    }

    public static void helper(int[] nums, List<Integer> perm, boolean[] used, List<List<Integer>> result) {
        if (perm.size() == nums.length) {
            result.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            perm.add(nums[i]);
            helper(nums, perm, used, result);
            perm.remove(perm.size() -1);
            used[i] = false;
        }
    }
}
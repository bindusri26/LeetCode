class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOr = 0;
        int count = 0;

        int totalSubsets = 1 << n; // 2^n subsets

        for (int mask = 1; mask < totalSubsets; mask++) { // skip mask = 0 (empty subset)
            int orValue = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    orValue |= nums[i];
                }
            }

            if (orValue > maxOr) {
                maxOr = orValue;
                count = 1;
            } else if (orValue == maxOr) {
                count++;
            }
        }

        return count;
    }
}
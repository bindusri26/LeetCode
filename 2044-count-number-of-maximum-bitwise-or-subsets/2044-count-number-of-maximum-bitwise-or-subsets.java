class Solution {
    // public int countMaxOrSubsets(int[] nums) {
        
    int maxOr = 0;
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        dfs(nums, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int index, int currOr) {
        if (index == nums.length) {
            if (currOr == maxOr) {
                count++;
            } else if (currOr > maxOr) {
                maxOr = currOr;
                count = 1;
            }
            return;
        }

        // Include nums[index]
        dfs(nums, index + 1, currOr | nums[index]);

        // Exclude nums[index]
        dfs(nums, index + 1, currOr);
    }
}

    

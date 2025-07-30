class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,count=0,maxLen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
            for(int j=0;j<nums.length;j++){
                // count=0;
                if(nums[j]==max){
                    count++;
                    maxLen=Math.max(maxLen,count);
                }else{
                    count=0;
                }

            }
        
        return maxLen;
    }
}
class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
       if(nums.length==0){
        return count;
       }
       for(int i=1;i<nums.length-1;i++){
        if(nums[i]==nums[i-1]){
            continue;
        }
        int start=i-1,end=i+1;
        while(start>0 && nums[start]==nums[i]){
            start--;
        
        }
        while(end<nums.length && nums[end]==nums[i]){
            
                end++;
            
        }
        // if((start >= 0 && end < nums.length)&&(nums[start]<nums[i] && nums[end]<nums[i])||(nums[start]>nums[i] && nums[end]>nums[i])){//precedence problem for and & or
        if (
    start >= 0 && end < nums.length &&
    (
        (nums[start] < nums[i] && nums[end] < nums[i]) ||
        (nums[start] > nums[i] && nums[end] > nums[i])
    )
) {

            count+=1;
        }

       }
       
    return count;
    }
}
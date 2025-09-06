class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length,low=0,high=n-1;
        int k;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                return mid;
                // n=mid;
                // break;
                 
            }else if(target>nums[mid]){
                low=mid+1;
                // k=low;
            }else{
                high=mid-1;
                // k=high;
            }
        }
        // for(int i=n-1;i>=k;i--){
        //     nums[i+1]=nums[i];
        // }

       return low;
        
    }
}
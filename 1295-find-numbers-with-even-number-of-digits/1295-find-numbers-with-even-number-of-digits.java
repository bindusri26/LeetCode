class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(nums[i]!=0){
                
                int x=nums[i];
                while(x>0){
                int y=x%10;
                count+=1;
                x=x/10;
            }
            }
            if(count%2==0){
                c+=1;
            }
        }
        return c;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=0){
                nums[insertPos]=nums[i];
            //to clean old pos
            if(i!=insertPos){
                nums[i]=0;
            }
                
              
            
            insertPos++;
        }

    }
}
}
        

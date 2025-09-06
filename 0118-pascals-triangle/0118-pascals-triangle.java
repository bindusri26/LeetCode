class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        int[] nums=new int[numRows+1];
        nums[0]=1;
        for(int i=1;i<=numRows;i++){
            
            for(int j=i-1;j>0;j--){
                nums[j]=nums[j]+nums[j-1];
            }
            List<Integer> r=new ArrayList<>();
            for(int k=0;k<i;k++){
                r.add(nums[k]);
            }
            result.add(r);
        }
       return result; 
    }
}
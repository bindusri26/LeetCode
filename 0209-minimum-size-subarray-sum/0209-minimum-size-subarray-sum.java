class Solution {
    public int minSubArrayLen(int target, int[] arr) {
       int start=0,sum=0,minLen=Integer.MAX_VALUE;
       for(int end=0;end<arr.length;end++){
        sum+=arr[end];
        while(sum>=target){
            minLen=Math.min(minLen,end-start+1);
            sum-=arr[start];
            start++;
            

        }
       }
       if(minLen==Integer.MAX_VALUE){
        return 0;
       }
       return minLen;
    }
}
class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        double maxAsum;
    //first window
    for(int i=0;i<k;i++){
        sum+=arr[i];
        
    }
    maxAsum=(double)sum/k;
    double maxx=maxAsum;
    for(int i=k;i<arr.length;i++){
        sum=sum+arr[i]-arr[i-k];
        maxAsum=(double)sum/k;
        if(maxx<maxAsum){
            maxx=maxAsum;
        }
    }
     return maxx;   
    }
}
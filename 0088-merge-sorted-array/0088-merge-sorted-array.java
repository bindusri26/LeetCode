class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
       
        
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                i--;
            }
            else{
                arr1[k]=arr2[j];
                j--;

            }
            k--;
        }

        
    }
}
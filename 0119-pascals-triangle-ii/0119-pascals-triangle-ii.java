class Solution {
    public List<Integer> getRow(int rowIndex) {
    List<Integer> row=new ArrayList<>();
      int[] n=new int[rowIndex+1];
      n[0]=1;
      for(int i=1;i<=rowIndex;i++){
       
        for(int j=i;j>0;j--){
            n[j]=n[j]+n[j-1];
        }
      
      }
        for(int k=0;k<=rowIndex;k++){
        row.add(n[k]);
        }
      
       
      return row;
    }
}
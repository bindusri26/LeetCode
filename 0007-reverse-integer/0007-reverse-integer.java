import java.util.Scanner;
class Solution {
    public int reverse(int x) {
        int n=0;
        int rev=0;
         while(x!=0){
            n=x%10;
            
            // Check if rev*10 will cause overflow
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
    return 0;}// Overflow condition met, return 0

            rev=rev*10+n;
            x=x/10;
            

        }
        
       return rev; 
    }
}
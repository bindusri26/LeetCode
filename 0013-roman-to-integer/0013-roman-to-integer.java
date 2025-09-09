import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        Hashtable<Character, Integer> table=new Hashtable<>();
        table.put('I',1);
        table.put('V',5);
        table.put('X',10);
        table.put('L',50);
        table.put('C',100);
        table.put('D',500);
        table.put('M',1000);
        
        for (int i = 0; i < s.length(); i++) {
            int x=table.get(s.charAt(i));
             if (i + 1 < s.length() && x < table.get(s.charAt(i + 1))) {
                sum -= x;  
            } else {
                sum += x;
            }
        }
       return sum; 
    }
}
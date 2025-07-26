import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int[] pCount=new int[26];
        int[] sCount=new int[26];

        if(s.length()<p.length()){
            return result;
        }
        //count of each letter in p
        for(int i=0;i<p.length();i++){
            int index=p.charAt(i)-'a';
            pCount[index]++;
        }
        for(int i=0;i<p.length();i++){
            int index1=s.charAt(i)-'a';
            sCount[index1]++;
        }
        if(Arrays.equals(pCount,sCount)){
            result.add(0);//anagram present and start index is 0
        }
        //slide the window across s
        for(int i=p.length();i<s.length();i++){
            sCount[s.charAt(i-p.length())-'a']--;//remove old ele(going out)
            sCount[s.charAt(i)-'a']++;//add the new ele(going in)
            if(Arrays.equals(pCount,sCount)){
                result.add(i-p.length()+1);
            }

        }

   return result;
        
    }
}
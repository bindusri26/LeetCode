class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       String[] words = paragraph.toLowerCase().split("[^a-z]+");
       Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
       Map<String,Integer> freqMap=new HashMap<>();
       
       for(String word:words){
        word=word.toLowerCase().replaceAll("[^a-z]","");
        // if(word.length()>0 && !word.equals(banned)){
            if(word.length()>0 && !bannedSet.contains(word)){
            freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        }
       }
       String mostFreqPair="";
       int mostFreq=0;
       for(Map.Entry<String,Integer> entry:freqMap.entrySet()){
        if(entry.getValue()>mostFreq){
            mostFreq=entry.getValue();
            mostFreqPair=entry.getKey();
        }
       }
       return mostFreqPair;
    }
}
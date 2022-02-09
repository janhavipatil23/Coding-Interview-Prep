class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        HashSet<String> banned_words = new HashSet<>();
        HashMap<String, Integer> valid_words = new HashMap<>();
        
        for(String banned_word:banned){
            banned_words.add(banned_word);
        }
        
        String[] words = paragraph.toLowerCase().split("\\W+");
        
        for(String word:words){
            if(!banned_words.contains(word)){
                valid_words.put(word, valid_words.getOrDefault(word,0) + 1);
            }
        }
        
        int max=0;
        String result ="";
        
        for(String word: valid_words.keySet()){
            if(valid_words.get(word)>max){
                max = valid_words.get(word);
                result = word;
            }
        }
        
        return result;
    }
}
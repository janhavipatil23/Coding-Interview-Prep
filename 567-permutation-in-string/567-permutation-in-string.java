class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int x = s1.length();
        int y = s2.length();
        
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        
        for(int i=0; i<x; i++){
            a1[s1.charAt(i) - 'a']++;
            a2[s2.charAt(i) - 'a']++;
        }
        
        for(int i=x; i<y; i++){
            if(Arrays.equals(a1,a2)){
                return true;
            }
            a2[s2.charAt(i-x) - 'a']--;
            a2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(a1,a2)){
            return true;
        }
        else{
            return false;
        }
        
        }
        
    }

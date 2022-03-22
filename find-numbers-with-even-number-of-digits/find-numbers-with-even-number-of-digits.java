class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for(int i: nums){
            int n = 0;
            while(i>0){
                i = i/10;
                n+=1;
        }
        count = n%2 == 0 ? count +=1 : count;
    }
    return count;
    }
}
        
       
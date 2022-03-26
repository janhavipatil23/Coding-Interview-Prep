class Solution {
    public int dominantIndex(int[] nums) {
        
        int max = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        
        for(int j=0; j<n; j++){
            if(nums[j] * 2 > max && nums[j] != max) {
                return -1;
            }
        }
        
        for(int k=0; k<n; k++){
            if(nums[k] == max){
                return k;
            }
        }
        
        return 0;
    
    }
}
class Solution {
    public int dominantIndex(int[] nums) {
        
//         int max = 0;
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             if(nums[i] > max){
//                 max = nums[i];
//             }
//         }
        
//         for(int j=0; j<n; j++){
//             if(nums[j] * 2 > max && nums[j] != max) {
//                 return -1;
//             }
//         }
        
//         for(int k=0; k<n; k++){
//             if(nums[k] == max){
//                 return k;
//             }
//         }
        
//         return 0;
        
        int largest;
        int second;
        if (nums.length == 1) return 0;
        if(nums[0] > nums[1]) {
            largest = 0;
            second= 1;
        }
        else {
            largest = 1;
            second = 0;
        }
        // if (nums.length == 1) return 0;
        for(int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[largest]) {
                second = largest;
                largest = i;
            } else if (nums[i] > nums[second]) {
                second = i;
            }
        }
        return nums[largest] >= nums[second] * 2 ? largest : -1;
    
    }
}
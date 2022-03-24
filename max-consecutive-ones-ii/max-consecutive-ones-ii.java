class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    // int result = 0;
    // int countFlipped = 0;
    // int countUnflipped = 0;
    // int i = 0;
    // while (i < nums.length) {
    //     if (nums[i] == 1) {
    //         countFlipped++;
    //         countUnflipped++;
    //     } else {
    //         countFlipped = countUnflipped + 1;
    //         countUnflipped = 0;
    //     }
    //     result = Math.max(result, Math.max(countFlipped, countUnflipped));
    //     i++;
    // }
    // return result;
    // }
    
    int result = 0;
    int i = 0;
    int j = 0;
    int n = nums.length;
    int k = 0;
    
    while(k<n){
        if(nums[k] == 1){
           i++;
           j++;
        
        }
        else{
          i = j + 1;
          j = 0;
        }
        result = Math.max(result, Math.max(i,j));
        k++;
    }
    return result; 
    }
}
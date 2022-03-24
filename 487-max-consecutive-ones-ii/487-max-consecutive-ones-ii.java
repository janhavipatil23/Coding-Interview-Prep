class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
    int countFlipped = 0;
    int countUnflipped = 0;
    int i = 0;
    while (i < nums.length) {
        if (nums[i] == 1) {
            countFlipped++;
            countUnflipped++;
        } else {
            countFlipped = countUnflipped + 1;
            countUnflipped = 0;
        }
        result = Math.max(result, Math.max(countFlipped, countUnflipped));
        i++;
    }
    return result;
    }
}
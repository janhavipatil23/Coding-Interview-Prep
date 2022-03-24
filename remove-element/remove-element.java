class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            if(nums[i] != val){
                int temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
                counter++;
            }
        }
        return counter;
    }
}
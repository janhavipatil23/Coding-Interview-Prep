class Solution {
    public int pivotIndex(int[] nums) {
       // int sum = 0, leftsum = 0;
       //  for (int x: nums) sum += x;
       //  for (int i = 0; i < nums.length; i++) {
       //      if (leftsum == sum - leftsum - nums[i]) return i;
       //      leftsum += nums[i];
       //  }
       //  return -1;
        
        final int sum = Arrays.stream(nums).sum();
        int prefix = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (prefix == sum - prefix - nums[i])
                return i;
            prefix += nums[i];
        }

        return -1;
    }
}
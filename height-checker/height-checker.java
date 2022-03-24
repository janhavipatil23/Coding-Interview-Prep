class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] unsorted = new int[heights.length];
        for(int i = 0; i < heights.length; i++) {
            unsorted[i] = heights[i];
        }
        Arrays.sort(heights);
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != unsorted[i]) {
                count++;
            }
        }
        return count;
    }
}
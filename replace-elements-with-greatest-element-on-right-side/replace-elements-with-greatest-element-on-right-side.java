class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int temp;
        
        //start from back
        for (int i=arr.length-1; i>=0; i--){
            temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }
            
        return arr;
    }
}

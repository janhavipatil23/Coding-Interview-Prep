class Solution {
   public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) return false;
        
        boolean increasing = A[1] > A[0];
        if (!increasing) return false; // the mountain must at least start in an increasing manner
        
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i-1]) return false; //plateaus are prohibited
            if (increasing) {
                if (A[i] < A[i-1]) increasing = false; // we reached the peak
            } else { // every element must be decreasing, otherwise return false
                if (A[i] > A[i-1]) return false;
            }
        }
        
        // we can't just return true, we must ensure that a peak was reached at some point.
        return !increasing ;
    }
}
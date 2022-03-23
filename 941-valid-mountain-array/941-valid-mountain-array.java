class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int n = arr.length;
        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
            return false;
        }
        while(i+1<n && arr[i]>arr[i+1]){
        i++;
        }

        return i==n-1;
        
//         if(arr == null || arr.length <3) return false;
        
//         boolean increasing = arr[1] > arr[0];
//         if(!increasing) return false;
        
//         for(int i=1; i<arr.length; i++){
//             if(arr[i] == arr[i-1]) return false;
            
//             if(increasing){
//                 if(arr[i] < arr[i-1]) increasing = false;
//             }else{
//                 if(arr[i] > arr[i+1]) return false;
//             }
//         }
//         return !increasing;
    }
}
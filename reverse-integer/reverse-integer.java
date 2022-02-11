class Solution {
    public int reverse(int x) {
        if(x==0){
            return 0;
        }
        
        StringBuffer stringbuff = new StringBuffer();
        boolean isNegative = x<0 ? true:false;
        
        x=Math.abs(x);
        
        while(x>0){
            int digit = x%10;
            stringbuff.append(digit);
            x=x/10;
        }
        
        int result = 0;
        // result = Integer.valueOf(stringbuff.toString());
        
        try{
            result = Integer.valueOf(stringbuff.toString());
        }
        catch (NumberFormatException e)
        {
            return 0;
        }
        
        if(isNegative){
            return -result;
        }
        else{
            return result;
        }
    
    }
}
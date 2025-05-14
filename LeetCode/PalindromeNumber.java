class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int org=x;
        int pno=0;
        while(x!=0){
            int rem=x%10;
            pno=pno*10+rem;
            x=x/10;
        }
        if (org==pno){
            return true;
        }
        else
        return false;
    }
}

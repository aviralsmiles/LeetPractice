class Solution {
    public boolean isPalindrome(int x) {
        int temp=0,num=x;
        
        while(x>0)
        {
          temp=temp*10+x%10;
            x=x/10;
        }
        if(temp==num)
        {
            return true;
        }
        return false;
    }
}
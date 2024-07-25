class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static int findSquare(int n){
        int res=0;
        while(n>0){
            int rem = n%10;
            int square=rem*rem;
            res+=square;
            n=n/10;
        }
        return res;
    }
}
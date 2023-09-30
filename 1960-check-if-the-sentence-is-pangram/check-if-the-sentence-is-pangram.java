class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length()<26){
            return false;
        }
        else{
            for(char ch='a' ; ch<='z'; ch++){
                if(s.indexOf(ch) < 0){
                    return false;
                }
            }
        }
        return true;
    }
}
class Solution {
    public int nextGreaterElement(int n) {
        //1,4,8,4,9,7,5,3,2
        char[] number = (n + "").toCharArray();
        int idx = -1;
        for (int i = number.length - 2; i >= 0; i--) {
            if (number[i] < number[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            return -1;
        }
        //find just greater number than idx
         //1,6,8,4,9,7,5,3,2 val is the 4
        char val=number[idx];//this is basically the idx value only i put in val variable
        int smallest=idx+1;// this is starting from just after 4 i.e 9 to the end
        for(int j=idx+1;j<number.length;j++){
            if(number[j]>val && number[j]<=number[smallest]){//this means is 7 greater than 4 and is 7 less than 9 . We want number just more than 4
            smallest=j;
            }
        }
        char temp=number[idx];
        number[idx]=number[smallest];
        number[smallest]=temp;
        Arrays.sort(number,idx+1,number.length);
        long ans= Long.parseLong(new String(number));
        if(ans>Integer.MAX_VALUE){
            return -1;
        }else{
            return (int)ans;
        }
    }
}
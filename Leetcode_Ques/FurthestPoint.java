class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int empty=0;
        for(int i=0; i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch == 'L'){
                left++;
            }else if(ch == 'R'){
                right++;
            }else{
                empty++;
            }
        }
        if(right > left){
            int temp=right+empty;
            temp = temp-left;
            return temp;
        }else if(right < left){
            int temp=left+empty;
            temp = temp-right;
            return temp;
        }else if(left == right){
            return empty;
        }
        return 0;
    }
}
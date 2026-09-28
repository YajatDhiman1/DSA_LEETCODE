class Solution {
    public int[] diStringMatch(String s) {
        int leftPtr=0;
        int rightPtr=s.length();
        int result[]=new int[s.length() + 1];
        int index=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){
                result[index] = leftPtr;
                leftPtr++;
                index++;
            }else{
                result[index] = rightPtr;
                rightPtr--;
                index++;
            }
        }
        
        if(s.charAt(s.length() - 1) == 'I'){
            result[index] = leftPtr;
        }else{
            result[index] = rightPtr;
        }
        return result;
    }
}
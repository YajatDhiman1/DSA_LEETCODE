class Solution {
    public int maxDepth(String s) {
        int maxdepth=0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch == '('){
                count++;
            }else if(ch == ')'){
                count--;
            }else{
                continue;
            }
            maxdepth = Math.max(maxdepth , count);
        }
        return maxdepth;
    }
}
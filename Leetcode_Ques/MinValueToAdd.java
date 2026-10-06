class Solution {
    public int minAddToMakeValid(String s) {
        int close = 0;
        Stack<Character> stk=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(stk.isEmpty()){
                    close++;
                }else{
                    stk.pop();
                }
            }else{
                stk.push('(');
            }
        }
        return close+stk.size();
    }
}
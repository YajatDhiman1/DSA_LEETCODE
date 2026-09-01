class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.size() == 0){
                    return false;
                }
                char top=stack.peek();
                if(same(top,ch)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
    public static boolean same(char top, char given){
        if(top=='('&&given==')' || top=='{'&&given=='}' || top=='['&&given==']'){
            return true;
        }else{
            return false;
        }
    }
}
class Solution {
    public String processStr(String s) {
        String res = "";
        for( int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch != '*' && ch != '#' && ch != '%'){
                res+=ch;
            }else if( ch == '*'){
                if(res.isEmpty()){
                    continue;
                }else{
                    res = res.substring(0,res.length()-1);
                }
            }else if( ch == '#'){
                String dupli=res;
                res+=dupli;
            }else if( ch == '%'){
                String y="";
                Stack<Character> stk=new Stack<>();
                for(int k=0; k<res.length(); k++){
                    char g=res.charAt(k);
                    stk.push(g);
                }
                while(!stk.isEmpty()){
                    y+=stk.pop();
                }
                res=y;
            }
        }
        return res;
    }
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str = new StringBuilder(s);
        StringBuilder strtwo = new StringBuilder(t);
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '#' && i == 0){
                str.deleteCharAt(i);
                i--;
            }else if(ch == '#'){
                str.deleteCharAt(i);
                i--;
                str.deleteCharAt(i);
                i--;
            }
        }
        for(int i=0; i<strtwo.length(); i++){
            char ch = strtwo.charAt(i);
            if(ch == '#'&&i==0){
                strtwo.deleteCharAt(i);
                i--;
            }else if(ch == '#'){
                strtwo.deleteCharAt(i);
                i--;
                strtwo.deleteCharAt(i);
                i--;
            }
        }

        return str.toString().equals(strtwo.toString());
    }
}
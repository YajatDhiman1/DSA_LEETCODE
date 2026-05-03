class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder str=new StringBuilder(s);
        int  len=s.length();
        int ptr=0;
        while(ptr < len){
            char ch = str.charAt(0);
            str.deleteCharAt(0);
            System.out.println(str);
            str.append(ch);
            System.out.println(str);
            if(goal.equals(str.toString())){
                return true;
            }
            ptr++;
        }
        return false;
    }
}
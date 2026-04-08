class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder str1=new StringBuilder(s);
        StringBuilder str2=new StringBuilder(t);
        for(int i=0; i<str1.length();i++){
            for(int j=0; j<str2.length();j++){
                char ch=str1.charAt(i);
                char cht=str2.charAt(j);
                if(ch==cht){
                    str1.deleteCharAt(i);
                    str2.deleteCharAt(j);
                    i--;
                    break;
                }
            }
        }
        return str2.charAt(0);
    }
}
class Solution {
    public String reverseWords(String s) {
        String[] er = s.trim().split("\\s+");
        String res="";
        System.out.print(er.length);
        for(int i=er.length-1; i>=0; i--){
            res+=er[i];
            if(i != 0){
                res+=" ";
            }
        }
        return res;
    }
}
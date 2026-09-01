class Solution {
    public String defangIPaddr(String address) {
        String gg="";
        for(int i=0; i<address.length(); i++){
            char ch = address.charAt(i);
            if(ch=='.'){
                gg+='[';
                gg+='.';
                gg+=']';
            }else{
                gg+=ch;
            }
        }
        return gg;
    }
}
package GFG_Ques;
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch , map.getOrDefault(ch, 0)+1);
        }
        for(int j=0;j<t.length();j++){
            char cht=t.charAt(j);
            map.put(cht, map.getOrDefault(cht,0)-1);
        }
        for(char m:map.keySet()){
            int freq=map.get(m);
            if(freq < 0){
                return false;
            }
        }
        return true;
    }
}
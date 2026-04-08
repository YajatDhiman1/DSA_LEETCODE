import java.util.*;
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        HashMap<Character,Integer> sone=new HashMap<>();
        for(char ch: s1.toCharArray()){
            if(sone.containsKey(ch)){
                int freq=sone.get(ch);
                sone.put(ch, freq+=1);
            }else{
                sone.put(ch,1);
            }
        }
        
        for(char ch:s2.toCharArray()){
            if(sone.containsKey(ch)){
                int freq=sone.get(ch);
                freq-=1;
                if(freq < 0){
                    return false;
                }
                sone.put(ch, freq);
            }else{
                return false;
            }
        }
        return true;
    }
}
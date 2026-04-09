package GFG_Ques;

import java.util.*;
class Sol {
    long equalPairs(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char nn:map.keySet()){
            int freq = map.get(nn);
            if(freq > 1){
                int uu = freq * freq;
                map.put(nn, uu);
            }
        }
        for(char gg: map.keySet()){
            int freq = map.get(gg);
            count+=freq;
        }
        return count;
    }
}
import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String ,Integer> map= new HashMap<>();
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<s.length()-10;i++){
            String d=s.substring(i, i+10);
            map.put(d, map.getOrDefault(d,0)+1);

            if(map.get(d) == 2){
                result.add(d);
            }
        }
        return result;
    }
}
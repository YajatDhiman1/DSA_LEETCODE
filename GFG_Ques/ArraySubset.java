import java.util.*;
class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<a.length; i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        int nn=b[0];
        for(int v=0; v<b.length; v++){
            map.put(b[v], map.getOrDefault(b[v],0)-1);
        }
        for(int ch: map.keySet()){
            int freq=map.get(ch);
            if(freq<0){
                return false;
            }
        }
        return true;
    }
}

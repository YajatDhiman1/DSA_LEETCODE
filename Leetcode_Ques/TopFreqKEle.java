import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int arr[]=new int[k];
        for(int le:nums){
            map.put(le, map.getOrDefault(le,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        // Below line is most imp this sorts the list based on freq from map
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
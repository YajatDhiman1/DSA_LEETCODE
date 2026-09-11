class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int len=arr.length/2;
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int freq: map.values()){
            l.add(freq);
        }
        Collections.sort(l, Collections.reverseOrder());
        int cntr = 0;

        for (int i = 0; i < l.size(); i++) {
            cntr += l.get(i);

            if (cntr >= len) {
                return i + 1;
            }
        }
        return 0;
    }
}
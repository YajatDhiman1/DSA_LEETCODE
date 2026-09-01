class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        int max=0;

        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        while (true) {
            ArrayList<Integer> row = new ArrayList<>();
            boolean found = false;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 0) {
                    row.add(entry.getKey());
                    entry.setValue(entry.getValue() - 1);
                    found = true;
                }
            }

            if (!found) break;   
            res.add(row);
        }
        return res;
    }
}
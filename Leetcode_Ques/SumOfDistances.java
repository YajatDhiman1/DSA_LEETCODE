class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer, Long> count = new HashMap<>();
        HashMap<Integer, Long> sum = new HashMap<>();
        long res[] = new long[nums.length];

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];

            if(count.containsKey(val)){
                res[i] += count.get(val) * i - sum.get(val);
            }

            count.put(val, count.getOrDefault(val, 0L) + 1);
            sum.put(val, sum.getOrDefault(val, 0L) + i);
        }

        count.clear();
        sum.clear();

        for(int i = nums.length - 1; i >= 0; i--){
            int val = nums[i];

            if(count.containsKey(val)){
                res[i] += sum.get(val) - count.get(val) * i;
            }

            count.put(val, count.getOrDefault(val, 0L) + 1);
            sum.put(val, sum.getOrDefault(val, 0L) + i);
        }

        return res;
        //I took help from chat
    }
}
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0 ;i<nums.length; i++){
            if(nums[i] <= 9){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }else{
                while(nums[i] != 0){
                    int temp =nums[i]%10;
                    map.put(temp, map.getOrDefault(temp, 0)+1);
                    nums[i]/=10;
                }
            }
        }
        if (map.containsKey(digit)) {
            return map.get(digit);
        }
        return 0;
    }
}
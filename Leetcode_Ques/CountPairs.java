class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int pair=0;
        int left=0, right=nums.size()-1;
        Collections.sort(nums);
        while(left < right){
            if(nums.get(left) + nums.get(right) < target){
                pair+=right-left;
                left++;
            }else{
                right--;
            }
        }
        return pair;
    }
}
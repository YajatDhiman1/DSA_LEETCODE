class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> l=new ArrayList<>();
        int min=nums[0];
        int max=nums[nums.length-1];
        int sum=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != min){
                l.add(min);
                i--;
            }
            min++;
        }
        return l;
    }
}
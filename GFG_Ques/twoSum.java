class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr){
            int remp = target-ele;
            if(set.contains(remp)){
                return true;
            }else{
                set.add(ele);
            }
        }
        return false;
    }
}
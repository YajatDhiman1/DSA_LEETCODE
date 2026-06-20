class Solution {
    public int differenceOfSum(int[] nums) {
        int ele_sum=0;
        int dig_sum=0;
        for(int i=0; i<nums.length; i++){
            ele_sum+=nums[i];
            if(nums[i] > 9){
                dig_sum += dig(nums[i]);
            }else{
                dig_sum += nums[i];
            }
        }
        return Math.abs(ele_sum - dig_sum);
    }
    public int dig(int n){
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}
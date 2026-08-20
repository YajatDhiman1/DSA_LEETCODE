class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> o = new ArrayList<>();
        ArrayList<Integer> v = new ArrayList<>();
        o.add(nums[0]);
        v.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (o.get(o.size() - 1) > v.get(v.size() - 1)) {
                o.add(nums[i]);
            } else {
                v.add(nums[i]);
            }
        }
        int k = 0;

        for (int x : o) {
            nums[k++] = x;
        }
        for (int x : v) {
            nums[k++] = x;
        }
        return nums;
    }
}
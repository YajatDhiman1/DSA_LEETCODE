class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length - 1; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                for (int k = j + 1; k < nums.length; k++) {

                    if (k > j + 1 && nums[k] == nums[k - 1])
                        continue;

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> l = new ArrayList<>();

                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);

                        list.add(l);
                    }
                }
            }
        }

        return list;
    }
}
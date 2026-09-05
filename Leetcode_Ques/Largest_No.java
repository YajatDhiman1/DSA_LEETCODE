class Solution {

    public int compare(String a, String b) {

        int total = a.length() + b.length();

        for (int i = 0; i < total; i++) {

            char x = a.charAt(i % a.length());
            char y = b.charAt(i % b.length());

            if (x > y) return -1;
            if (x < y) return 1;
        }

        return 0;
    }

    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, this::compare);

        if (arr[0].charAt(0) == '0') {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }
}
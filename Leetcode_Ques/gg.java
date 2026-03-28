class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];

        // Step 1: give every child 1 candy
        for (int i = 0; i < n; i++) {
            candy[i] = 1;
        }

        // Step 2: left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        // Step 3: right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        // Step 4: total sum
        int sum = 0;
        for (int x : candy) {
            sum += x;
        }

        return sum;
    }
}
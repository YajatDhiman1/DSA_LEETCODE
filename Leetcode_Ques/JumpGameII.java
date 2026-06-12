class Solution {
    public int jump(int[] arr) {
        int i = 0;
        int n = arr.length;
        int step = 0;

        while (i != n - 1) {

            // Can directly reach the last index
            if (i + arr[i] >= n - 1) {
                return step + 1;
            }

            int path = arr[i];
            int bestIndex = i;
            int maxReach = 0;

            for (int o = 1; o <= path; o++) {
                if (i + o < n) {
                    int reach = (i + o) + arr[i + o];

                    if (reach > maxReach) {
                        maxReach = reach;
                        bestIndex = i + o;
                    }
                }
            }

            i = bestIndex;
            step++;
        }

        return step;
    }
}
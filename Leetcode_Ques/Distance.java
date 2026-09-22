class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans = new int[t.length];
        int[] stack = new int[t.length];
        int top = -1;

        for (int i = 0; i < t.length; i++) {
            while (top >= 0 && t[i] > t[stack[top]]) {
                int index = stack[top--];
                ans[index] = i - index;
            }
            stack[++top] = i;
        }

        return ans;
    }
}
class Solution {
    public int numTrees(int n) {
        return countBST(n);
    }
    public int countBST(int n) {
        if (n <= 1) return 1;

        int ans = 0;

        for (int root = 1; root <= n; root++) {
            ans += countBST(root - 1) * countBST(n - root);
        } 

        return ans;
    }
}
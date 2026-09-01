/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> treemap=new HashMap<>();
        Mode(root,treemap);
        ArrayList<Integer> modes = new ArrayList<>();
        int maxFreq = 0;

        for (int freq : treemap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        for (Map.Entry<Integer, Integer> entry : treemap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }

        int[] ans = new int[modes.size()];

        for (int i = 0; i < modes.size(); i++) {
            ans[i] = modes.get(i);
        }

        return ans;
    }
    public void Mode(TreeNode root, HashMap<Integer, Integer> t){
        if(root==null) return ;
        t.put(root.val, t.getOrDefault(root.val,0)+1);
        Mode(root.left, t);
        Mode(root.right, t);
    }
}
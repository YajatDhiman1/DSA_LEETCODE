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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> q=new LinkedList<>();
        Stack<Integer> stk=new Stack<>();
        int level=1;

        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr=q.remove();
                if(level % 2 == 1){
                    l.add(curr.val);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                if(level % 2 == 0){
                    stk.push(curr.val);
                }
            }

            while(!stk.isEmpty()){
                l.add(stk.pop());
            }
            list.add(l);
            level++;
        }
        
        return list;
    }
}
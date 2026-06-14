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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder,
                           int preStart,
                           int inStart,
                           int inEnd) {

        if (preStart >= preorder.length || inStart > inEnd) {
            return null;
        }

    
        TreeNode root = new TreeNode(preorder[preStart]);

        int index = inStart;
        while (index <= inEnd) {
            if (inorder[index] == root.val) {
                break;
            }
            index++;
        }

        int leftSize = index - inStart;

        root.left = build(preorder,
                          inorder,
                          preStart + 1,
                          inStart,
                          index - 1);

        root.right = build(preorder,
                           inorder,
                           preStart + leftSize + 1,
                           index + 1,
                           inEnd);

        return root;
    }
}
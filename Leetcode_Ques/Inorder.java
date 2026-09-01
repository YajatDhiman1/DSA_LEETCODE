class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root, list);
        return list;
    }
    public static void inorder(TreeNode root, ArrayList l){
        if(root == null){
            return;
        }
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
}
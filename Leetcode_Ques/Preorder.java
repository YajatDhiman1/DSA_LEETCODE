class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        preorder( root,list);
        return list;
    }
    public static void preorder(TreeNode root, ArrayList gg){
        if(root == null){
            return ;
        }
        gg.add(root.val);
        preorder(root.left,gg);
        preorder(root.right,gg);
    }
}
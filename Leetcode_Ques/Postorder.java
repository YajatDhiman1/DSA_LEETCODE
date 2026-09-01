class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        postorder(root, list);
        return list;
    }
    public void postorder(TreeNode root, ArrayList<Integer> l){
        if(root == null){
            return;
        }
        postorder(root.left,l);
        postorder(root.right,l);
        l.add(root.val);
    }
}

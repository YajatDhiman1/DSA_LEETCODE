class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        String str="";
        ArrayList<String> ans = new ArrayList<>();
        dfs(root,str,ans);
        return ans;
    }
    public void dfs(TreeNode root, String str, ArrayList<String> a){
        if(root==null)return;
        str+=root.val;
        if(root.left == null && root.right == null){
            a.add(str);
            return;
        }
        str+="->";
        dfs(root.left, str, a);
        dfs(root.right, str, a);
    }
}
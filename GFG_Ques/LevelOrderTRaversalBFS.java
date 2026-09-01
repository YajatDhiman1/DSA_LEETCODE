/* A binary tree Node
class Node {
	public int data;
	public Node left;
	public Node right;
	
	// Constructor
	public Node(int val) {
		data = val;
		left = null;
		right = null;
	}
};
*/

class Solution {
	public ArrayList<Integer> levelOrder(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i<size; i++) {
				Node curr = q.remove();
				int t = curr.data;
				list.add(t);
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		
		return list;
	}
}

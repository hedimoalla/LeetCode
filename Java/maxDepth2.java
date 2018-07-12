/**
 * Definition for a binary tree node.
*/
class maxDepth2 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
			val = x; 
		}
		public String toString() {
            String result = "" + this.val;
            if (left != null) {
                // there are next node(s) after me
                result += " -> " + left.toString();
            }
            if (right != null) {
            	result += " -> " + right.toString();
            }
            return result;
        }
	}
    public static int maxDepth(TreeNode root) {
        if (root == null)
        	return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(7);
    	root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(9);
        int depth = maxDepth(root);
        System.out.println("The tree " + root.toString() + " is " + depth + " levels deep.");
    }
}
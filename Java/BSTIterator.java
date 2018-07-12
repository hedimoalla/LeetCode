

 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x; 
    }
 }
 

public class BSTIterator {
    Stack<TreeNode> stack;
    TreeNode cur;
    public static BSTIterator(TreeNode root) {
        cur = root;
        stack = new Stack<>();
        while(cur != null){
            stack.add(cur);
            cur = cur.left;
        }
    }

    /** @return whether we have a next smallest number */
    public static boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public static int next() {
        int returnVal;
        if(cur != null){
            returnVal = cur.val;
            stack.push(cur);
            cur = cur.left;
        }
        else{
            TreeNode next = stack.pop();
            returnVal = next.val;
            cur=next.right;
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
        }
        return returnVal;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        BSTIterator(root);
        System.out.println("Repeating 10-letter substrings from " + str + " are " + results);
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
package leetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class 翻转二叉树266 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
}

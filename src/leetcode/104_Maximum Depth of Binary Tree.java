package leetcode;


/**
 * 104
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * @author soft
 *
 */
public class MaximumDepthofBinaryTree {
	 public int maxDepth(TreeNode root) {
		 if(root == null)
			 return 0;
		 if(root.left == null && root.right == null) {
			 return 1;
		 }
		 int left = 1 + maxDepth(root.left);
		 int right = 1 + maxDepth(root.right);
		 return (left > right) ? left : right;
	 }
}

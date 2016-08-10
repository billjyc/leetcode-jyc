package leetcode;

/**
 *  Given a binary tree and a sum, determine if the tree has a root-to-leaf path 
 *  such that adding up all the values along the path equals the given sum.
	For example:
	Given the below binary tree and sum = 22,

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1

	return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * @author soft
 *
 */
public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		return calPathSum(root, 0, sum);
	}
	
	private boolean calPathSum(TreeNode node, int current, int sum) {
		if(node == null) {
			return false;
		}
		if(node.left == null && node.right == null) {
			return current + node.val == sum;
		}
		return calPathSum(node.left, current + node.val, sum) || calPathSum(node.right, current + node.val, sum);
	}
}

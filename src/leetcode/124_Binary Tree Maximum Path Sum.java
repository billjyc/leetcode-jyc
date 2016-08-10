/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxPathSum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        ResultType result = helper(root);
        return result.maxSum;
    }
    
    private ResultType helper(TreeNode root) {
        if(root == null) {
            return new ResultType(0, Integer.MIN_VALUE);
        }
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        int singlePath = Math.max(left.singlePath, right.singlePath) + root.val;
        singlePath = Math.max(0, singlePath);
        int maxPath = Math.max(left.maxSum, right.maxSum);
        maxPath = Math.max(maxPath, left.singlePath + root.val + right.singlePath);
        return new ResultType(singlePath, maxPath);
    }
}

class ResultType {
    int singlePath;
    int maxSum;
    
    public ResultType(int singlePath, int maxSum) {
        this.singlePath = singlePath;
        this.maxSum = maxSum;
    }
}
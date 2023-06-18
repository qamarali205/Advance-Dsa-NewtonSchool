// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

class Solution {
    
    public long rootToLeaf(TreeNode root){
        return findMaxPathSum(root, 0);
       
    }
    long findMaxPathSum(TreeNode node, long currentSum) {
        if (node == null) {
            return 0;
        }

        currentSum += node.val;

        if (node.left == null && node.right == null) {
            return currentSum;
        }

        long leftSum = findMaxPathSum(node.left, currentSum);
        long rightSum = findMaxPathSum(node.right, currentSum);

        return Math.max(leftSum, rightSum);
    }
    
}
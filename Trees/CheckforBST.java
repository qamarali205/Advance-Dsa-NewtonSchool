// class Node{
//     int data;
//     Node left;
//     Node right;
//     Node(int data){
//         this.data = data;
//         left=null;
//         right=null;
//     }
// }


class Solution
{
  
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)  
    { 
        // code here
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
    } 
     boolean isBSTUtil(Node node, int minVal, int maxVal) {
        if (node == null)
            return true;

        if (node.data <= minVal || node.data >= maxVal)
            return false;

        return isBSTUtil(node.left, minVal, node.data) && isBSTUtil(node.right, node.data, maxVal);
    }

}
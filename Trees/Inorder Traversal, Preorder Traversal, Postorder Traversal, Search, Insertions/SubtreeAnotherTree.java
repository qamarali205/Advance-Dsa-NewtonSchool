
/*
class Node{
    int data;
    Node left;
    Node right;
  
    Node(int data){
        this.data = data;
        left=null;
        right=null;
       
    }
}
*/
public static boolean isSubtree(Node root, Node subRoot) {
//Write your code here 
 if (root == null && subRoot == null) {
        return true;
    }

    if (root == null || subRoot == null) {
        return false;
    }

    if (isIdentical(root, subRoot)) {
        return true;
    }

    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
}

static boolean isIdentical(Node node1, Node node2) {
    if (node1 == null && node2 == null) {
        return true;
    }

    if (node1 == null || node2 == null) {
        return false;
    }

    return (node1.data == node2.data) && isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
}
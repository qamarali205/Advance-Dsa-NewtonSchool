/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
public static boolean isIdentical(Node root1, Node root2)
{
           // Your code here
          // return true or false if both trees are identical or not
          if (root1 == null && root2 == null) {
                return true;
            }
           if(root1 == null || root2 == null || root1.data!=root2.data){
               return false;
           }

             return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
}
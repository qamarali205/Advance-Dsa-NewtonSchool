/*
class Node
{
    int data;
    Node left, right;
    Node(int data)
   {
      this.data = data;
      this.left = this.right = null;
   }
}
*/

static int getHeight(Node node) 
{
     // Your code here
     if(node==null){
        return 0;
     }else{
        int leftHeight=getHeight(node.left);
        int rightHeight=getHeight(node.right);
        return Math.max(leftHeight, rightHeight)+1;
     }
}
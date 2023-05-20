/*
// Information about the Node class
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
*/
static Node insertInBST(Node root,int key)
{
   // Your code here
   if(root==null){
       return new Node(key);
   }   
   if(key<root.data){
       if(root.left==null){
           root.left=new Node(key); 
       }else{
           root.left=insertInBST(root.left,key);
       }
   }else if(key>root.data){
       if(root.right==null){
           root.right=new Node(key);
       }else{
           root.right=insertInBST(root.right,key);
       }
   }
   return root;
}
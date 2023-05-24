/*class Node {
    int value;
    Node left;
    Node right;
    
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
} 
public class Main{ */  
static Node insert(Node root, int data){
    if(root ==null){
        root=new Node(data);
        return root;
    }
    if(root.value>data){
        root.left=insert(root.left,data);
    }else{
        root.right=insert(root.right,data);
    }
    return root;
}
public static void main(String[] args) {
     // Write your code here to create the tree 
     int arr[]={7, 4, 5, 2, 9};
     Node root=null;
     for(int i=0; i<arr.length; i++){
         root=insert(root,arr[i]);
     } 
        
 
     // pass the root node through printTree function
     printTree(root);
    }
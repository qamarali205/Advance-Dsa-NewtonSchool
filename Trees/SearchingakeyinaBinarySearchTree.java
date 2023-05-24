public static int searchInBST(Node root,int key)
    {
   // write your code here
   if(root == null) {
        return -1;
    }
     if(root.data==key){
         return 1;
     }else if(root.data>key){
         return searchInBST(root.left,key);
     }else{
         return searchInBST(root.right,key);
     }

    } {
    
}

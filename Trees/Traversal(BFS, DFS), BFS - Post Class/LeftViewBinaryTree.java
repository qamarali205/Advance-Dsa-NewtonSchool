/*
//Information about the class Node
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

private static void printLeftView(Node root) {
    // Your Code goes here   
    Queue<Node> queue=new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        int size=queue.size();
        for(int i=0; i<size; i++){
            Node currentNode=queue.poll();
            if (i == 0) {
                    System.out.print(currentNode.data + " ");
                }
                 if (currentNode.left != null)
                    queue.add(currentNode.left);
                if (currentNode.right != null)
                    queue.add(currentNode.right);

        }
    }    
}
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

static void printRightView(Node node) 
{
        // Your code 
       // You can make you helper function as well
          Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                Node currentNode = queue.poll();

                if(i == (size - 1)) {
                    System.out.print(currentNode.data + " ");
                }

                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        } 
        
}
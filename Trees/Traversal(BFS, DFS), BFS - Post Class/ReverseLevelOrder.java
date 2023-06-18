/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

*/


static void reverseLevelOrder(Node node) {
     //Write your code here 
     Queue<Node> queue=new LinkedList<>();
     Stack<Integer> stack=new Stack<>();
     queue.add(node);

     while(!queue.isEmpty()){
         Node currentNode=queue.poll();
         stack.add(currentNode.data);

         if(currentNode.right!=null){
             queue.add(currentNode.right);
         }
         if(currentNode.left!=null){
             queue.add(currentNode.left);
         }
     }
     while(!stack.isEmpty()){
         System.out.print(stack.pop()+" ");
     }



}
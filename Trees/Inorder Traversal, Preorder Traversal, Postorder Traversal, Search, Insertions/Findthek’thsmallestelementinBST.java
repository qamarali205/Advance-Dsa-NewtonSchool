/*
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
        }
    }
*/

public static void kthSmallestInBST(Node root, int k) {
    // Write your code here
     Stack<Node> stack = new Stack<>();
        Node current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;

            if (count == k) {
                System.out.println(current.data);
                return;
            }

            current = current.right;
        }

        System.out.println("The kth smallest element does not exist in the BST.");
    

}
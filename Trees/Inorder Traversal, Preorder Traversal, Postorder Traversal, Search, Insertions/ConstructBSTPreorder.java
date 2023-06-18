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
        
        Node(int data) {
            this.data = data;
        }
    }
*/   

public static Node constructBSTfromPreorder(ArrayList<Integer> arr) {
     if (arr == null || arr.isEmpty()) {
        return null;
    }

    return helper(arr, 0, arr.size() - 1);

    }
    static Node helper(ArrayList<Integer> arr, int start, int end) {
    if (start > end) {
        return null;
    }

    int rootValue = arr.get(start);
    Node root = new Node(rootValue);

    int rightSubtreeIndex = start + 1;
    while (rightSubtreeIndex <= end && arr.get(rightSubtreeIndex) < rootValue) {
        rightSubtreeIndex++;
    }

    root.left = helper(arr, start + 1, rightSubtreeIndex - 1);
    root.right = helper(arr, rightSubtreeIndex, end);

    return root;

    }
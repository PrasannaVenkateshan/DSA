//A node is a visible node, if the path from the root of the binary tree to itself(both inclusive) does not contain any node whose value strictly greater than the current node's value.
//Find the total number of visible nodes in the given binary tree

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.io.*;

class Solution {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this(val, null, null);
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static Node buildTree() {
      // Node root = new Node(5);
      // root.left = new Node(4);
      // root.right = new Node(6);
      // root.left.left = new Node(3);
      // root.left.right = new Node(8);

      // Node root = new Node(5);

      // Node root = new Node(5);
      // root.left = new Node(4);
      // root.right = new Node(3);

      // Node root = new Node(-5);
      // root.left = new Node(-4);
      // root.right = new Node(-3);

      Node root = new Node(5);
      root.left = new Node(6);
      root.left.left = new Node(7);
      root.left.left.left = new Node(8);
      
      return root;
    }

/*  Check if root is not null
    If not null then we check if the val is greater than the max value
    If yes, increase the count by 1 and assign max to val
    We call the left child of the node recursively
    We call the right child recursively as well
    We return the count
*/


    public static int findVisibleNodesCount(Node root, int max) {
      int count = 0;
      if(root != null) {
        if(root.val >= max) {
          count++;
          max = root.val;
          System.out.println("Root value is " + max);
        }
        count = count + findVisibleNodesCount(root.left, max) + findVisibleNodesCount(root.right, max);
      }
      return count;
    }

    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println(findVisibleNodesCount(root, Integer.MIN_VALUE));
    }
}

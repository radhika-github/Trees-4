/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// Brute Force
// Time Complexity: O(n)
// Space Complexity: O(n)
 class Solution {
     public int kthSmallest(TreeNode root, int k) {
         List<Integer> list = new ArrayList<>();
         inorder(root, list);
         return list.get(k-1);
     }

     public void inorder(TreeNode root, List<Integer> list) {
         if(root == null) {
             return;
         }
         inorder(root.left, list);
         list.add(root.val);
         inorder(root.right, list);
     }
 }


// Time Complexity: O(Height of tree + k )
// Space Complexity: O(Height of tree + k )
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack();

        while(true) {
            while(root != null) {
                stack.add(root);
                root = root.left;
            }

            root = stack.pop();
            k--;
            if(k == 0) {
                return root.val;
            }
            root = root.right;
        }
    }
}
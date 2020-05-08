/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// Recursive Solution
// Time Complexity:O(n)
// Space Complexity: O(n)
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if(p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }
}

// Iterative Solution
// Time Complexity: O(n)
// Space Complexity: O(1)
 class Solution {
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         while(true) {
             if(p.val > root.val && q.val > root.val) {
                 root = root.right;
             } else if(p.val < root.val && q.val < root.val) {
                 root = root.left;
             } else {
                 return root;
             }
         }

     }
 }
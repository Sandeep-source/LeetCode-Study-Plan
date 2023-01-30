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
class Solution {
    public TreeNode invertTree(TreeNode root) {
        /**
         Approach:
        1- If root is None then return Return None
        2- Otherwise swap the children
        3- Call this function recursively for both children. This will do swap for all node in tree at last we will get inverted tree
        4- return the root
         */
        if(root==null){
            return null;
        }
        TreeNode left=root.left;
        root.left=root.right;
        root.right=left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
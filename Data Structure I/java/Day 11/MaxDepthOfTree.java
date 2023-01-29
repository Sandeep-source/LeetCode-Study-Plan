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
    public int maxDepth(TreeNode root) {
        /**
         Approach:
         1- Create a recursive function and call the function with root and intitially depth value as zero
         2- The Recursive function will do the following 
            a) If the root is null return the current depth value
            b) Otherwise call same function for both child by adding 1 to the depth
            c) At the end return the maximum of both values returned by the recursive function calls
         3- At the last return whaterver the recursive function returned to you
         */
        return maxD(root,0);
    }
    public int maxD(TreeNode root,int val){
        if(root==null){
            return val;
        }
        int a=maxD(root.left,val+1);
        int b=maxD(root.right,val+1);
        return a>b?a:b;

    }
}
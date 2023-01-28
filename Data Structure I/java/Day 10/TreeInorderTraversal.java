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
    public List<Integer> inorderTraversal(TreeNode root) {
         /**
        Simple Approach:
          1- Create a recursive method
          2- If the root is null rhen return 
          3- Otherwise first call same method for left tree then add value to list  and then call for right tree;
        */
        return inOrder(root,new ArrayList<>());
    }
    public List<Integer> inOrder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return list;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
        return list;
    }
}
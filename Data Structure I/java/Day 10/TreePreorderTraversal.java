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
    public List<Integer> preorderTraversal(TreeNode root) {
         /**
        Simple Approach:
          1- Create a recursive method
          2- If the root is null rhen return 
          3- Otherwise add value to list then first call same method for left tree and then for right tree;
        */
        return preOrder(root,new ArrayList<>());
    }
    public List<Integer> preOrder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return list;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
        return list;
    }
}
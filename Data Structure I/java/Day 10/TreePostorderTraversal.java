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
    public List<Integer> postorderTraversal(TreeNode root) {
        /**
        Simple Approach:
          1- Create a recursive method
          2- If the root is null rhen return 
          3- Otherwise first call same method for left tree then call for right tree and then add value to list ;
         */
        return postOrder(root,new ArrayList<>());
    }
    public List<Integer> postOrder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return list;
        }
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
        return list;
    }
}
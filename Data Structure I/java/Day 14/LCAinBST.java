/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode current;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if(root==null){
             return null;
         }
         int min=p.val>q.val?q.val:p.val;
         int max=p.val>q.val?p.val:q.val;
         if(root.val<min){
             return lowestCommonAncestor(root.right,p,q);
         }
         if(root.val>max){
             return lowestCommonAncestor(root.left,p,q);
         }
         if(search(root,p.val)&&search(root,q.val)){
             return root;
         }
         TreeNode a=lowestCommonAncestor(root.left,p,q);
         TreeNode b=lowestCommonAncestor(root.right,p,q);
         if(a==null){
             return b;
         }
         if(b==null){
             return a;
         }
         if(a.val<b.val){
             return a;
         }else{
             return b;
         }

    }
    public boolean search(TreeNode root,int val){
        if(root==null){
            return false;
        }
        if(root.val==val){
            return true;
        }
        if(root.val>val){
            return search(root.left,val);
        }else{
             return search(root.right,val);
        }

    }
}
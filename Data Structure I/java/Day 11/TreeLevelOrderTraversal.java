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
    public List<List<Integer>> levelOrder(TreeNode root) {
        /**
        Approach:
         1- Create a current list and add root to list
         2- Create a recursive function and call the functions with current list and ans list. This fun do the following
            a) If current list is null then retun 
            a) For each element in the list add the value to a temporaryAns list and their child (Element of new level)  to a temporaryCurrent list
            b) Now add new temporaryAns list to ansList and call recursive function with new temporaryCurrent(new Level) list 
         3- At last return the ans returned by the the recursive function
         */
        List<List<Integer>> ans=new ArrayList<>();
        List<TreeNode> current=new ArrayList<>();
        current.add(root);
        traverse(current,ans);
        return ans;
    }
    public void traverse(List<TreeNode> current,List<List<Integer>> ans){
        if(current.size()==0){
            return;
        }
        List<Integer> tempAns=new ArrayList<>();
        List<TreeNode> temp=new ArrayList<>();
        for(TreeNode node : current){
                if(node==null){
                    return;
                }
                tempAns.add(node.val);
                if(node.left!=null){
                    temp.add(node.left);
                }
                if(node.right!=null){
                    temp.add(node.right);
                }
        }
        ans.add(tempAns);
        traverse(temp,ans);
    }
}
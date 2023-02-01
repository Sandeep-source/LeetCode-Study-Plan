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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        has(root,list);
        System.out.println(list);
        int s=0;
        int e=list.size()-1;
        while(s<e){
            int sum=list.get(s)+list.get(e);
            if(sum==k){
                return true;
            }
            if(sum>k){
                e--;
            }else{
                s++;
            }

        }
        return false;

    }
    void has(TreeNode root,ArrayList<Integer> list){
         if(root==null){
             return;
         }
         has(root.left,list);
         list.add(root.val);
         has(root.right,list);
    }
}
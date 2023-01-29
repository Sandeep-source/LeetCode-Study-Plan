/**
 * Definition for a binary tree node->
 * public class TreeNode* {
 *     int val;
 *     TreeNode* left;
 *     TreeNode* right;
 *     TreeNode*() {}
 *     TreeNode*(int val) { this->val = val; }
 *     TreeNode*(int val, TreeNode* left, TreeNode* right) {
 *         this->val = val;
 *         this->left = left;
 *         this->right = right;
 *     }
 * }
 */
class Solution {
    public bool isSymmetric(TreeNode* root) {
        /*
        Approach:
        1- If root is null return true means no node then tree is symmetric
        2- Create a recursive function and pass left and right child to fun 
           a) If both child are null then return true
           b) If one of them are null then return false they sould be same to be summetric
           c) If key are same then call check of tree are symmetric till this label now recirively call this fun two times
              I) With left child of right subtree and right child of left subtree because they mirror ecah other so they will be
                compared for equality 
              II) With left child of left subtree and right child of right subtree because they mirror ecah other so they will be
                compared for equality
           d) At last return false this line will not be executed if one one the above had already ran
        3) retun whatever returned by the recursive functions
        */
        if(root==NULL){
            return true;
        }
        return isSym(root->left,root->right);
    }
    public bool isSym(TreeNode* left,TreeNode* right){
        if(left==NULL&&right==NULL){
            return true;
        }
        if(left==NULL||right==NULL){
            return false;
        }
        if(left->val==right->val){
            return isSym(left->right,right->left) && isSym(right->right,left->left);
        }
        return false;
    }
}
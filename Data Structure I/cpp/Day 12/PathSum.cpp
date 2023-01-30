/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool hasPathSum(TreeNode* root, int targetSum) {
        /*
        Approach:
        1- Create a recursive function and call with root and current sum as 0
        2- The function will do following
           a) If root is null then return false
           b) Otherwise add value of root to current sum
           c) If both of the childs are null it means we are at the leaf now if the current sum is equal to th target then we
              found the answer just return it.
           d) Otherwise call the same function for both child passing the current sum
        3- At the last return whatever returned by the Function
        */
        return check(root,0,targetSum);
    }
    bool check(TreeNode* root,int current,int targetSum){
        if(root==NULL){
            return false;
        }
        current+=root->val;
        if(root->left==NULL&&root->right==NULL&&current==targetSum){
            return true;
        }
        return check(root->left,current,targetSum)||check(root->right,current,targetSum);
    }
};
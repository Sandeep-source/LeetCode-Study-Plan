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
    vector<int> preorderTraversal(TreeNode* root) {
        /**
        Simple Approach:
          1- Create a recursive method
          2- If the root is null rhen return 
          3- Otherwise add value to list then first call same method for left tree and then for right tree;
        */
        vector<int> ans;
        preorder(root,ans);
        return ans;
    }
    void preorder(TreeNode* root, vector<int>& ans){
        if(root==NULL){
            return;
        }
        ans.push_back(root->val);
        preorder(root->left,ans);
        preorder(root->right,ans);
    }
};
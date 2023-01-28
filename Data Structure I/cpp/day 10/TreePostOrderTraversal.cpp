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
    vector<int> postorderTraversal(TreeNode* root) {
         /**
         Simple Approach:
          1- Create a recursive method
          2- If the root is null rhen return 
          3- Otherwise first call same method for left tree then call for right tree and then add value to list ;
       
        */
        vector<int> ans;
        postorder(root,ans);
        return ans;
    }
    void postorder(TreeNode* root, vector<int>& ans){
        if(root==NULL){
            return;
        }
        postorder(root->left,ans);
        postorder(root->right,ans);
        ans.push_back(root->val);
    }
};
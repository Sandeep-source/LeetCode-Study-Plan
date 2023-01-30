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
    TreeNode* invertTree(TreeNode* root) {
         /*
          Approach:
        1- If root is None then return Return None
        2- Otherwise swap the children
        3- Call this function recursively for both children. This will do swap for all node in tree at last we will get inverted tree
        4- return the root
         */
        if(root==NULL){
            return NULL;
        }
        TreeNode* left=root->left;
        root->left=root->right;
        root->right=left;
        invertTree(root->left);
        invertTree(root->right);
        return root;
    }
};
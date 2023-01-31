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
    TreeNode* insertIntoBST(TreeNode* root, int val) {
        /*
        Approach:
         1- Perform binary tree search until root is null without returning value and storing the parent node
         2- Now if parent node is null then create a new TreeNode and return node
         3- Otherwise 
            a) If val is less than parent's val then make a new node and make it left child of parent
            b) Otherwise make a new node and make it right child of parent
         4- Return the root node
        */
        TreeNode* parent=NULL;
        TreeNode* ans=root;
        while(root!=NULL){
            parent=root;
            if(root->val>val){
                root=root->left;
            }else{
                root=root->right;
            }
        }
        if(parent==NULL){
            ans=new TreeNode(val);
        }else{
            if(val>parent->val){
                parent->right=new TreeNode(val);
            }else{
                parent->left=new TreeNode(val);
            }
        }
        return ans;
    }
};
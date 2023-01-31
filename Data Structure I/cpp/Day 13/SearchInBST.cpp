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
    TreeNode* searchBST(TreeNode* root, int val) {
        /*
        Approach:
        1- Start from the root and do following until the root is null
        2- If the value of root is equal to the number you are searching for just return it 
        3- If the root is greater than the target num (val) then search in left subtree by assigning root=root.left
        4- Otherwise search in right subtree by assigning root=root.right
        5- At last return null if answer not found

        */
        while(root!=NULL){
            if(root->val==val){
                return root;
            }
            if(root->val>val){
                root=root->left;
            }else{
                root=root->right;
            }

        }
        return NULL;
    }
};
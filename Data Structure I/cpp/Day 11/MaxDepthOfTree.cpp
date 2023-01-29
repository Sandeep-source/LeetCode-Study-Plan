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
    int maxDepth(TreeNode* root) {
        /*
         Approach:
         1- Create a recursive function and call the function with root and intitially depth value as zero
         2- The Recursive function will do the following 
            a) If the root is null return the current depth value
            b) Otherwise call same function for both child by adding 1 to the depth
            c) At the end return the maximum of both values returned by the recursive function calls
         3- At the last return whaterver the recursive function returned to you
        */
        return maxD(root,0);
    }
   int maxD(TreeNode* root,int val){
        if(root==NULL){
            return val;
        }
        int a=maxD(root->left,val+1);
        int b=maxD(root->right,val+1);
        return a>b?a:b;

    }
    
};
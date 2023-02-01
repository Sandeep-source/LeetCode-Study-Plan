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
    bool findTarget(TreeNode* root, int k) {
        vector<int> list;
        has(root,list);
        int s=0;
        int e=list.size()-1;
        while(s<e){
            int sum=list[s]+list[e];
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
    void has(TreeNode* root,vector<int>& list){
         if(root==NULL){
             return;
         }
         has(root->left,list);
         list.push_back(root->val);
         has(root->right,list);
    }
};
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
    vector<vector<int>> levelOrder(TreeNode* root) {
        /*
        Approach:
         1- Create a current list and add root to list
         2- Create a recursive function and call the functions with current list and ans list. This fun do the following
            a) If current list is null then retun 
            a) For each element in the list add the value to a temporaryAns list and their child (Element of new level)  to a temporaryCurrent list
            b) Now add new temporaryAns list to ansList and call recursive function with new temporaryCurrent(new Level) list 
         3- At last return the ans returned by the the recursive function
        */
        vector<vector<int>> ans;
        vector<TreeNode*> current;
        current.push_back(root);
        traverse(current,ans);
        return ans;
    }
   void traverse(vector<TreeNode*> current,vector<vector<int>>& ans){
        if(current.size()==0){
            return;
        }
        vector<int> tempAns;
        vector<TreeNode*> temp;
        for(TreeNode* node : current){
                if(node==NULL){
                    return;
                }
                tempAns.push_back(node->val);
                if(node->left!=NULL){
                    temp.push_back(node->left);
                }
                if(node->right!=NULL){
                    temp.push_back(node->right);
                }
        }
        ans.push_back(tempAns);
        traverse(temp,ans);
    }
};
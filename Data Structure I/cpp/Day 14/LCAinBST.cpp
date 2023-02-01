/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
      if(root==NULL){
             return NULL;
         }
         int min=p->val>q->val?q->val:p->val;
         int max=p->val>q->val?p->val:q->val;
         if(root->val<min){
             return lowestCommonAncestor(root->right,p,q);
         }
         if(root->val>max){
             return lowestCommonAncestor(root->left,p,q);
         }
         if(search(root,p->val)&&search(root,q->val)){
             return root;
         }
         TreeNode* a=lowestCommonAncestor(root->left,p,q);
         TreeNode* b=lowestCommonAncestor(root->right,p,q);
         if(a==NULL){
             return b;
         }
         if(b==NULL){
             return a;
         }
         if(a->val<b->val){
             return a;
         }else{
             return b;
         }

    }
    bool search(TreeNode* root,int val){
        if(root==NULL){
            return false;
        }
        if(root->val==val){
            return true;
        }
        if(root->val>val){
            return search(root->left,val);
        }else{
             return search(root->right,val);
        }

    }

};
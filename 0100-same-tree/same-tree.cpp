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
    vector<int> a1, a2;

    void traversal(TreeNode *z){
        if(z == nullptr) {
            a1.push_back(INT_MIN);
            return;
        }

        a1.push_back(z->val);
        traversal(z->left);
        traversal(z->right);
    }

    void traversal1(TreeNode *z){
        if(z == nullptr) {
            a2.push_back(INT_MIN);
            return;
        }

        a2.push_back(z->val);
        traversal1(z->left);
        traversal1(z->right);
    }

    bool isSameTree(TreeNode* p, TreeNode* q) {
        traversal(p);
        traversal1(q);

        if(a1.size() != a2.size())
            return false;

        for(int i = 0; i < a1.size(); i++){
            if(a1[i] != a2[i])
                return false;
        }

        return true;
    }
};
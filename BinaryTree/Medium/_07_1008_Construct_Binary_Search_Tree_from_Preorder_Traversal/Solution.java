package BinaryTree.Medium._07_1008_Construct_Binary_Search_Tree_from_Preorder_Traversal;

import BinaryTree.Medium._00_TreeNode.TreeNode;

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstHelper(preorder, 0, preorder.length - 1);
    }

    private TreeNode bstHelper(int[] preorder, int left, int right){
        if(left > right) return null;
        if(left == right) return new TreeNode(preorder[left]);

        int rootVal = preorder[left];
        int firstGreater = left;
        for(int i = left + 1; i <= right; i++){
            if(preorder[i] > rootVal){
                firstGreater = i;
                break;
            }
        }

        TreeNode leftTree, rightTree;

        if(firstGreater == left){
            leftTree = bstHelper(preorder, left + 1, right);
            rightTree = null;
        } else {
            leftTree = bstHelper(preorder, left + 1, firstGreater - 1);
            rightTree = bstHelper(preorder, firstGreater, right);
        }

        return new TreeNode(rootVal, leftTree, rightTree);
    }
}

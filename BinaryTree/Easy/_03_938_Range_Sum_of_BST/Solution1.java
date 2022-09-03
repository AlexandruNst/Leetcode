package BinaryTree.Easy._03_938_Range_Sum_of_BST;

import BinaryTree.Easy._00_TreeNode.TreeNode;

class Solution1 {
    int result = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root, low, high);
        return result;
    }

    private void inorder(TreeNode root, int low, int high){
        if(root == null) return;
        inorder(root.left, low, high);
        if(root.val >= low && root.val <= high) result += root.val;
        inorder(root.right, low, high);
    }
}

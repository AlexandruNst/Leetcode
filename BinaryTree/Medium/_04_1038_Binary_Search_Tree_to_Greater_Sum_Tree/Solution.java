package BinaryTree.Medium._04_1038_Binary_Search_Tree_to_Greater_Sum_Tree;

import BinaryTree.Medium._00_TreeNode.TreeNode;

class Solution {
    public TreeNode bstToGst(TreeNode root) {
        bstToGstHelper(root, 0, true, 0);
        return root;
    }

    private void bstToGstHelper(TreeNode root, int parent, boolean left, int oldParentVal){
        if(root == null) return;
        int oldVal = root.val;

        if(left) root.val += parent + sumSubtree(root.right);
        if(!left) root.val = parent - oldParentVal - sumSubtree(root.left);

        bstToGstHelper(root.left, root.val, true, oldVal);
        bstToGstHelper(root.right, root.val, false, oldVal);
    }

    private int sumSubtree(TreeNode root){
        if(root == null) return 0;
        return root.val + sumSubtree(root.left) + sumSubtree(root.right);
    }
}

package BinaryTree.Medium._01_1302_Deepest_Leaves_Sum;

import BinaryTree.Medium._00_TreeNode.TreeNode;

class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int height = treeHeight(root);
        int sum = sumOfLeavesAtLevel(root, height);
        return sum;
    }

    private int treeHeight(TreeNode root){
        return treeHeightHelper(root, 0);
    }

    private int treeHeightHelper(TreeNode root, int height){
        if(root == null) return height;
        else return Math.max(treeHeightHelper(root.left, height + 1), treeHeightHelper(root.right, height + 1));
    }

    private int sumOfLeavesAtLevel(TreeNode root, int height){
        return sumOfLeavesAtLevelHelper(root, height, 0);
    }

    private int sumOfLeavesAtLevelHelper(TreeNode root, int height, int currLevel){
        if(root == null) return 0;
        if(isLeaf(root)){
            if(currLevel == height - 1) return root.val;
            else return 0;
        } else {
            return sumOfLeavesAtLevelHelper(root.left,  height, currLevel + 1) +
                    sumOfLeavesAtLevelHelper(root.right, height, currLevel + 1);
        }
    }

    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
}

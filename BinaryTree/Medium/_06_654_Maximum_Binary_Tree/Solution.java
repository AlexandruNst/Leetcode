package BinaryTree.Medium._06_654_Maximum_Binary_Tree;

import BinaryTree.Medium._00_TreeNode.TreeNode;

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructHelper(nums, 0, nums.length - 1);
    }

    private TreeNode constructHelper(int[] nums, int left, int right){
        if(left > right) return null;

        int[] maxAndPos = getMax(nums, left, right);
        int max = maxAndPos[0];
        int pos = maxAndPos[1];

        TreeNode leftTree  = constructHelper(nums, left, pos - 1);
        TreeNode rightTree = constructHelper(nums, pos + 1, right);

        return new TreeNode(max, leftTree, rightTree);
    }

    private int[] getMax(int[] nums, int left, int right){
        int max = -1;
        int pos = -1;
        for(int i = left; i <= right; i++){
            if(nums[i] > max){
                max = nums[i];
                pos = i;
            }
        }
        return new int[] {max, pos};
    }
}

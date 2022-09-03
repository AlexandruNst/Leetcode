package BinaryTree.Easy._03_938_Range_Sum_of_BST;

import BinaryTree.Easy._00_TreeNode.TreeNode;

class Solution2 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int sum = 0;
        if(root.val >= low && root.val <= high) sum += root.val;
        if(root.val > low) sum +=  rangeSumBST(root.left, low, high);
        if(root.val < high) sum +=  rangeSumBST(root.right, low, high);

        return sum;
    }
}

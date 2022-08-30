package BinaryTree.Easy._01_2236_Root_Equals_Sum_of_Children;

import BinaryTree.Easy._00_TreeNode.TreeNode;

//T: O(1)
//S: O(1)

class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}

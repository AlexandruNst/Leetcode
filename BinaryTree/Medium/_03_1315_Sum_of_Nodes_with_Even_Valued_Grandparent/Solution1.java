package BinaryTree.Medium._03_1315_Sum_of_Nodes_with_Even_Valued_Grandparent;

import BinaryTree.Medium._00_TreeNode.TreeNode;

class Solution1 {
    int result = 0;

    public int sumEvenGrandparent(TreeNode root) {
        sumEvenGrandparentHelper(root, -1, -1);
        return result;
    }

    private void sumEvenGrandparentHelper(TreeNode root, int parent, int grandparent){
        if(root == null) return;
        if(grandparent % 2 == 0){
            result += root.val;
        }
        sumEvenGrandparentHelper(root.left, root.val, parent);
        sumEvenGrandparentHelper(root.right, root.val, parent);
    }
}

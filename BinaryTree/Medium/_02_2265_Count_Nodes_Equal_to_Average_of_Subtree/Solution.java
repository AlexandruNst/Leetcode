package BinaryTree.Medium._02_2265_Count_Nodes_Equal_to_Average_of_Subtree;

import BinaryTree.Medium._00_TreeNode.TreeNode;

class Solution {
    int res = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return res;
    }

    private int[] dfs(TreeNode root){
        if(root == null){
            return new int[] {0, 0};
        }
        if(isLeaf(root)){
            res++;
            return new int[] {root.val, 1};
        }

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int sum = left[0] + right[0] + root.val;
        int count = left[1] + right[1] + 1;
        int avg = sum / count;

        if(root.val == avg) res++;

        return new int[] {sum, count};
    }

    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
}

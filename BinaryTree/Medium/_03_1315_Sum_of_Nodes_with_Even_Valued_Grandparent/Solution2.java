package BinaryTree.Medium._03_1315_Sum_of_Nodes_with_Even_Valued_Grandparent;

import BinaryTree.Medium._00_TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 {
    public int sumEvenGrandparent(TreeNode root) {
        if(root == null) return 0;
        int currSum = 0;
        if(root.val % 2 == 0){
            currSum += sumGrandchildren(root);
        }
        return currSum + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
    }

    private int sumGrandchildren(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for(int i = 0; i < 2; i++){
            int size = queue.size();
            for(int j = 0; j < size; j++){
                TreeNode currNode = queue.poll();
                if(currNode.left != null)  queue.offer(currNode.left);
                if(currNode.right != null) queue.offer(currNode.right);
            }
        }
        int sum = 0;
        while(queue.size() > 0){
            sum += queue.poll().val;
        }
        return sum;
    }
}

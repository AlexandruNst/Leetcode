package BinaryTree.Easy._02_1379_Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree;

import BinaryTree.Easy._00_TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q_o = new LinkedList<>();
        Queue<TreeNode> q_c = new LinkedList<>();

        q_o.offer(original);
        q_c.offer(cloned);

        while(!q_o.isEmpty()){
            TreeNode node_o = q_o.poll();
            TreeNode node_c = q_c.poll();

            if(node_o == target){
                return node_c;
            }

            if(node_o.left != null){
                q_o.offer(node_o.left);
                q_c.offer(node_c.left);
            }

            if(node_o.right != null){
                q_o.offer(node_o.right);
                q_c.offer(node_c.right);
            }
        }

        return null;
    }
}

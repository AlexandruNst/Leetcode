package BinaryTree.Medium._05_1305_All_Elements_in_Two_Binary_Search_Trees;

import BinaryTree.Medium._00_TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<TreeNode> inOrderRoot1 = inOrderArrayHelper(root1, new ArrayList<>());
        List<TreeNode> inOrderRoot2 = inOrderArrayHelper(root2, new ArrayList<>());

        List<Integer> res = zip(inOrderRoot1, inOrderRoot2);
        return res;
    }

    private List<TreeNode> inOrderArrayHelper(TreeNode root, List<TreeNode> array){
        if(root == null) return array;
        inOrderArrayHelper(root.left, array);
        array.add(root);
        inOrderArrayHelper(root.right, array);
        return array;
    }

    private List<Integer> zip(List<TreeNode> arr1, List<TreeNode> arr2){
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i).val == arr2.get(j).val){
                res.add(arr1.get(i).val);
                res.add(arr2.get(j).val);
                i++;
                j++;
            } else if(arr1.get(i).val < arr2.get(j).val){
                res.add(arr1.get(i).val);
                i++;
            } else {
                res.add(arr2.get(j).val);
                j++;
            }
        }

        while(i < arr1.size()){
            res.add(arr1.get(i).val);
            i++;
        }

        while(j < arr2.size()){
            res.add(arr2.get(j).val);
            j++;
        }

        return res;
    }

}

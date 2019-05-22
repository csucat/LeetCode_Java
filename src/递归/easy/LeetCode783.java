package 递归.easy;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode783 {
    /**
     * 执行用时 : 2 ms, 在Minimum Distance Between BST Nodes的Java提交中击败了74.31% 的用户
     * 内存消耗 : 34.7 MB, 在Minimum Distance Between BST Nodes的Java提交中击败了72.03% 的用户
     * */
    class Solution {
        Integer min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        public void BST(TreeNode root){
            if(root.left != null){
                BST(root.left);
            }
            if(root != null){
                list.add(root.val);
            }
            if(root.right != null){
                BST(root.right);
            }
        }
        public int minDiffInBST(TreeNode root) {
            BST(root);
            for (int i = 1; i <list.size() ; i++) {
                min = Math.min(min,list.get(i)-list.get(i-1));
            }
            return min;
        }
    }
}

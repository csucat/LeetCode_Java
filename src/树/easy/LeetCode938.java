package 树.easy;

import 树.TreeNode;

public class LeetCode938 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    /**
     * 执行用时 : 4 ms, 在Range Sum of BST的Java提交中击败了58.51% 的用户
     * 内存消耗 : 54.2 MB, 在Range Sum of BST的Java提交中击败了18.70% 的用户
     * */
    class Solution {
        int sum = 0;
        public int rangeSumBST(TreeNode root, int L, int R) {
            if(root.left != null){
                rangeSumBST(root.left,L,R);
            }
            if(root.right != null){
                rangeSumBST(root.right,L,R);
            }
            if(root.val >= L && root.val <= R){
                sum += root.val;
            }
            return sum;
        }
    }
}

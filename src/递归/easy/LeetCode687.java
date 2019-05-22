package 递归.easy;

import 树.TreeNode;

public class LeetCode687 {
    /**
     * 执行用时 : 5 ms, 在Longest Univalue Path的Java提交中击败了95.51% 的用户
     * 内存消耗 : 49.4 MB, 在Longest Univalue Path的Java提交中击败了72.87% 的用户
     * */
    class Solution {
        int count = 0;

        public int longestUnivaluePath(TreeNode root) {
            arrowLength(root);
            return count;
        }

        public int arrowLength(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = arrowLength(root.left);
            int right = arrowLength(root.right);
            int arrowLeft = 0, arrowRight = 0;
            if(root.left != null && root.left.val == root.val){
                arrowLeft += left+1;
            }
            if(root.right != null && root.right.val == root.val){
                arrowRight+=right+1;
            }
            count = Math.max(count,arrowLeft+arrowRight);
            return Math.max(arrowLeft,arrowRight);
        }
    }
}

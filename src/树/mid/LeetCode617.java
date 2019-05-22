package 树.mid;

import 树.TreeNode;

public class LeetCode617 {
    /**
     * 执行用时 : 2 ms, 在Merge Two Binary Trees的Java提交中击败了95.50% 的用户
     * 内存消耗 : 47.8 MB, 在Merge Two Binary Trees的Java提交中击败了66.35% 的用户
     * */
    class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if(t2 == null){
                return t1;
            }
            if(t1 == null){
                return t2;
            }
            TreeNode root = new TreeNode((t1 == null ? 0:t1.val) + (t2 == null ? 0: t2.val));
            TreeNode left = mergeTrees(t1 == null ? null:t1.left , t2 == null ? null:t2.left);
            TreeNode right = mergeTrees(t1 == null ? null:t1.right,t2 == null? null:t2.right);
            root.left = left;
            root.right = right;
            return root;
        }
    }
}

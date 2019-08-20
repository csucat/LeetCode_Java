package HOT100;

import 树.TreeNode;

public class LeetCode226 {
    /**
     * 执行用时 :1 ms, 在所有 Java 提交中击败了89.61% 的用户
     * 内存消耗 :34.8 MB, 在所有 Java 提交中击败了38.99%的用户
     * */
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root == null){
                return null;
            }
            TreeNode right = invertTree(root.right);
            TreeNode left = invertTree(root.left);
            root.left = right;
            root.right = left;
            return root;
        }
    }
}

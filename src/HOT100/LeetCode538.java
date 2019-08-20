package HOT100;

import 树.TreeNode;

public class LeetCode538 {
    /**
     * 执行用时 :1 ms, 在所有 Java 提交中击败了100.00% 的用户
     * 内存消耗 :47.6 MB, 在所有 Java 提交中击败了45.28%的用户
     * */
    class Solution {
        int sum = 0;

        public TreeNode convertBST(TreeNode root) {
            backOrder(root);
            return root;
        }
        public void backOrder(TreeNode root){
            if(root == null){
                return;
            }
            backOrder(root.right);
            root.val += sum;
            sum = root.val;
            backOrder(root.left);
        }
    }
}

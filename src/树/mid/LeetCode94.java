package 树.mid;



import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {
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
     * 执行用时 : 2 ms, 在Binary Tree Inorder Traversal的Java提交中击败了46.40% 的用户
     * 内存消耗 : 34.8 MB, 在Binary Tree Inorder Traversal的Java提交中击败了39.36% 的用户
     * */
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            while(cur != null || !stack.isEmpty()){
                if(cur != null){
                    stack.push(cur);
                    cur = cur.left;
                }else{
                    cur = stack.pop();
                    list.add(cur.val);
                    cur = cur.right;
                }
            }
            return list;
        }
    }
}

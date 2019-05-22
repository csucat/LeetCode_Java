package 树.easy;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode98 {
    class Solution {
        /**
         * 中序遍历为递增的值
         * 执行用时 : 4 ms, 在Validate Binary Search Tree的Java提交中击败了38.53% 的用户
         * 内存消耗 : 37.1 MB, 在Validate Binary Search Tree的Java提交中击败了88.53% 的用户
         * */
        public boolean isValidBST(TreeNode root) {
            if(root == null){
                return true;
            }
            List<Integer> list = new ArrayList<>();
            fun(root,list);
            for (int i = 0; i <list.size() ; i++) {
                if(i != 0){
                    if(list.get(i-1) >= list.get(i)){
                        return false;
                    }
                }
            }
            return true;
        }
        public void fun(TreeNode root,List<Integer> list){
            if(root == null){
                return ;
            }
            fun(root.left,list);
            list.add(root.val);
            fun(root.right,list);
        }
    }
    /**
     * 执行用时 : 1 ms, 在Validate Binary Search Tree的Java提交中击败了97.15% 的用户
     * 内存消耗 : 35.4 MB, 在Validate Binary Search Tree的Java提交中击败了97.93% 的用户
     * */
    class Solution1 {
        Double last = Double.MIN_VALUE;
        public boolean isValidBST(TreeNode root) {
            if(root == null){
                return true;
            }
            if(isValidBST(root.left)){
                if(last < root.val){
                    last = root.val/1.0;
                    return isValidBST(root.right);
                }
            }
            return false;
        }
    }

}

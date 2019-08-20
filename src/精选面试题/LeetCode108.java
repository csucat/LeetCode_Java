package 精选面试题;

import 树.TreeNode;

import java.util.Arrays;

public class LeetCode108 {

    /**
     * 执行用时 : 3 ms, 在Convert Sorted Array to Binary Search Tree的Java提交中击败了7.62% 的用户
     * 内存消耗 : 39.3 MB, 在Convert Sorted Array to Binary Search Tree的Java提交中击败了41.76% 的用户
     * */

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if(nums.length==0)
                return null;
            TreeNode res = new TreeNode(nums[nums.length/2]);
            res.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,nums.length/2));
            res.right = sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2+1,nums.length));
            return res;
        }
    }

}

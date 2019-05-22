package 数组.easy;

import java.util.Arrays;

public class LeetCode561 {
    class Solution {
        /**
         * 执行用时 : 36 ms, 在Array Partition I的Java提交中击败了65.25% 的用户
         * 内存消耗 : 48.8 MB, 在Array Partition I的Java提交中击败了63.35% 的用户
         * */
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int result = 0;
            for (int i = 0; i <nums.length; i+=2) {
                result += nums[i];
            }
            return result;
        }
    }
}

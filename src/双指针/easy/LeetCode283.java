package 双指针.easy;

public class LeetCode283 {
    class Solution {
        /**
         * 执行用时 : 1 ms, 在Move Zeroes的Java提交中击败了98.16% 的用户
         * 内存消耗 : 40.3 MB, 在Move Zeroes的Java提交中击败了62.50% 的用户
         * */
        public void moveZeroes(int[] nums) {
            int i = 0,j = 0;
            for (i = 0;  i<nums.length; i++) {
                if(nums[i]!= 0){
                    nums[j++]=nums[i];
                }
            }
            while (j<nums.length){
                nums[j++] = 0;
            }

        }

    }
}

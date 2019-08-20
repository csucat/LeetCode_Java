package 精选面试题;

public class LeetCode238 {
    /**
     * 执行用时 :4 ms, 在所有 Java 提交中击败了31.61% 的用户
     * 内存消耗 :52.1 MB, 在所有 Java 提交中击败了22.02%的用户
     * */
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int len = nums.length;
            int[] output = new int[len];
            for (int i = 0; i < len ; i++) {
                if(i == 0){
                    output[i] = 1;
                }else {
                    output[i] = output[i-1] * nums[i-1];
                }
            }
            int right = 1;
            for (int i = len-1; i >= 0 ; i--) {
                output[i] *= right;
                right *= nums[i];
            }
            return output;
        }
    }
}

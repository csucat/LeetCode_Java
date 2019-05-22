package 数组.easy;

import java.util.Arrays;

public class LeetCode977 {
    /**
     * 执行用时 : 8 ms, 在Squares of a Sorted Array的Java提交中击败了85.87% 的用户
     * 内存消耗 : 50.9 MB, 在Squares of a Sorted Array的Java提交中击败了66.50% 的用户
     * */
    class Solution {
        public int[] sortedSquares(int[] A) {
            for (int i = 0; i < A.length; i++) {
                A[i] = Math.abs(A[i]);
                A[i] = A[i]*A[i];
            }
            Arrays.sort(A);
            return A;
        }
    }
}

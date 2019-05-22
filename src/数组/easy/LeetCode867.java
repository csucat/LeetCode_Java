package 数组.easy;

public class LeetCode867 {
    class Solution {
        /**
         * 执行用时 : 1 ms, 在Transpose Matrix的Java提交中击败了99.60% 的用户
         * 内存消耗 : 38.6 MB, 在Transpose Matrix的Java提交中击败了95.47% 的用户
         * */
        public int[][] transpose(int[][] A) {
            int[][] B = new int[A[0].length][A.length];
            for (int i = 0; i <A.length ; i++) {
                for (int j = 0; j <A[0].length ; j++) {
                    B[j][i] = A[i][j];
                }
            }
            return B;
        }
    }
}

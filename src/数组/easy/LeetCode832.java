package 数组.easy;

public class LeetCode832 {
    /**
     * 执行用时 : 2 ms, 在Flipping an Image的Java提交中击败了85.71% 的用户
     * 内存消耗 : 37.9 MB, 在Flipping an Image的Java提交中击败了91.03% 的用户
     * */
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int[][] B = new int[A.length][A[0].length];
            for (int i = 0; i <A.length ; i++) {
                for (int j = 0; j <A[0].length ; j++) {
                    B[i][j] = 1 - A[i][A[0].length-j-1];
                }
            }
            return B;
        }
    }
}

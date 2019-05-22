package 数组.easy;

public class LeetCode556 {
    class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            if (nums.length * nums[0].length == r * c) {
                int[][] res = new int[r][c];
                int idx1 = 0;
                int idx2 = 0;
                for (int i = 0; i < nums.length; i++) {
                    for (int j = 0; j < nums[0].length; j++) {
                        if (idx2 >= c) {
                            idx1++;
                            idx2 = 0;
                        }
                        res[idx1][idx2++] = nums[i][j];
                    }
                }
                return res;
            } else {
                return nums;
            }
        }
    }
}

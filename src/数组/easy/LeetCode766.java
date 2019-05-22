package 数组.easy;

public class LeetCode766 {
    class Solution {
        /**
         * 执行用时 : 5 ms, 在Toeplitz Matrix的Java提交中击败了63.99% 的用户
         * 内存消耗 : 40.5 MB, 在Toeplitz Matrix的Java提交中击败了93.42% 的用户
         * */
        public boolean isToeplitzMatrix(int[][] matrix) {
            int M = matrix.length;
            int N = matrix[0].length;
            boolean flag = true;
            for (int i = 0; i <N; i++) {
                int temp = matrix[0][i];
                if(!check(matrix,temp,0,i)){
                    return false;
                }
            }
            for (int i = 0; i <M ; i++) {
                int temp = matrix[i][0];
                if(!check(matrix,temp,i,0)){
                    return false;
                }
            }
            return true;
        }
        public boolean check(int[][] matrix,int value,int i,int j){
            if(i>matrix.length-1 || j>matrix[0].length-1){
                return true;
            }
            if(matrix[i][j] != value){
                return false;
            }
            return check(matrix,value,i+1,j+1);
        }
    }

}

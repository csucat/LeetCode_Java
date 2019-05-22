package 数组.easy;

public class LeetCode905 {
    /**
     * 执行用时 : 3 ms, 在Sort Array By Parity的Java提交中击败了98.54% 的用户
     * 内存消耗 : 45 MB, 在Sort Array By Parity的Java提交中击败了73.85% 的用户
     * */
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            int i= 0;
            int j = A.length-1;

            while (i<j){
                if(A[i] % 2 == 1 && A[j] % 2 == 0){
                    swap(A,i,j);
                }
                while (A[i] % 2 == 0 && i<j){
                    i++;
                }
                while (A[j] % 2 == 1 && i<j){
                    j--;
                }
            }
            return A;
        }
        public void swap(int[]A ,int i,int j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
}

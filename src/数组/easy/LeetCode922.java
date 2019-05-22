package 数组.easy;

public class LeetCode922 {
    /**
     * 执行用时 : 9 ms, 在Sort Array By Parity II的Java提交中击败了55.65% 的用户
     * 内存消耗 : 50.6 MB, 在Sort Array By Parity II的Java提交中击败了39.18% 的用户
     * */
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int j = A.length-1;
            for (int i = 0; i <A.length ; i++) {

                if(i%2 == 0 && A[i] %2 == 1){
                    while (j > 0 && A[j] % 2 == 1 ){
                        j--;
                    }
                    swap(A,i,j);
                } else if(i%2 == 1 && A[i]%2 == 0){
                    while (j>0 && A[j] %2 != 1  ){
                        j--;
                    }
                    swap(A,i,j);
                }
            }
            return A;
        }
        public void swap(int[] A,int i,int j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
}

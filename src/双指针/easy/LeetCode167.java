package 双指针.easy;

public class LeetCode167 {
    class Solution {
        /**
         * 执行用时 : 2 ms, 在Two Sum II - Input array is sorted的Java提交中击败了60.94% 的用户
         * 内存消耗 : 37.8 MB, 在Two Sum II - Input array is sorted的Java提交中击败了62.87% 的用户
         * */
        public int[] twoSum(int[] numbers, int target) {
            int i = 0;
            int j = numbers.length-1;
            while (i < j){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }else if(numbers[i] + numbers[j] < target){
                    i++;
                }else{
                    j--;
                }
            }
            return new int[]{i+1,j+1};
        }
    }
}

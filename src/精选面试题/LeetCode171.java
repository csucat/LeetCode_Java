package 精选面试题;

public class LeetCode171 {
    /**
     * 执行用时 : 5 ms, 在Excel Sheet Column Number的Java提交中击败了94.48% 的用户
     * 内存消耗 : 34.8 MB, 在Excel Sheet Column Number的Java提交中击败了50.12% 的用户
     * */
    class Solution {
        public int titleToNumber(String s) {
            if(s.equals("") || s == null){
                return 0;
            }
            char[] list = s.toCharArray();
            int sum = 0;
            int count = 1;
            for (int i = list.length-1; i >=0 ; i--) {
                char temp = list[i];
                int t = (int)(temp-'A'+1);
                sum = sum + t*count;
                count = count*26;
            }
            return sum;
        }
    }
}

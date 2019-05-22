package 双指针.easy;

public class LeetCode345 {
    class Solution {
        /**
         * 执行用时 : 5 ms, 在Reverse Vowels of a String的Java提交中击败了96.81% 的用户
         * 内存消耗 : 35.6 MB, 在Reverse Vowels of a String的Java提交中击败了100.00% 的用户
         * */
        public String reverseVowels(String s) {
            char[] list = s.toCharArray();
            int i = 0;int j = list.length-1;
            while (i<j){
                while (i<j && !inS(list[i])){
                    i++;
                }
                while (i<j && !inS(list[j])){
                    j--;
                }
                swap(list,i,j);
                i++;
                j--;
                if(i>=j){
                    break;
                }
            }
            /**
             * char[]数组转字符串，使用String.valueOf()效率高。
             * */
            String result = String.valueOf(list);
            return result;
        }
        public boolean inS(char s){
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'
             || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U'){
                return true;
            }else {
                return false;
            }
        }
        public void swap(char[] list,int i,int j){
            char temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}

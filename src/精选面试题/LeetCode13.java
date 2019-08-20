package 精选面试题;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {
    /**
     * 执行用时 : 25 ms, 在Roman to Integer的Java提交中击败了74.82% 的用户
     * 内存消耗 : 40.6 MB, 在Roman to Integer的Java提交中击败了72.03% 的用户
     * */
    class Solution {
        public int romanToInt(String s) {
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case 'I':
                        result += 1;
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'X':
                        result += 10;
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'C':
                        result += 100;
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'M':
                        result += 1000;
                        break;
                }
            }
            for (int j = 0; j < s.length() - 1; j++) {
                switch ("" + s.charAt(j) + s.charAt(j + 1)) {
                    case "IV":
                    case "IX":
                        result -= 2;
                        break;
                    case "XL":
                    case "XC":
                        result -= 20;
                        break;
                    case "CD":
                    case "CM":
                        result -= 200;
                        break;
                }
            }
            return result;
        }
    }
}

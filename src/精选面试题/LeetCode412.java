package 精选面试题;

import java.util.ArrayList;
import java.util.List;

public class LeetCode412 {
    /**
     * 执行用时 : 3 ms, 在Fizz Buzz的Java提交中击败了92.46% 的用户
     * 内存消耗 : 41.6 MB, 在Fizz Buzz的Java提交中击败了67.96% 的用户
     * */
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();
            String fizz = "Fizz";
            String buzz = "Buzz";
            String fb = "FizzBuzz";
            for (int i = 1; i <= n; i++) {
                if(i%3 == 0 && i%5 == 0){
                    result.add(fb);
                }else if(i % 3 == 0){
                    result.add(fizz);
                }else if(i % 5== 0){
                    result.add(buzz);
                }else {
                    result.add(String.valueOf(i));
                }
            }
            return result;
        }
    }
}

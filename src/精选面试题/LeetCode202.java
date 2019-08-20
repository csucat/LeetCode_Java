package 精选面试题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode202 {
    /**
     * 执行用时 :6 ms, 在所有Java提交中击败了61.03% 的用户
     * 内存消耗 :33.7 MB, 在所有Java提交中击败了27.64%的用户
     * */
    Set<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        int result = 0;
        while (n > 0){
            int i = n%10;
            result += i*i;
            n /= 10;
        }
        if(set.contains(result)){
            return false;
        }else {
            set.add(result);
        }
        if(result == 1){
            return true;
        }
        return isHappy(result);
    }
}

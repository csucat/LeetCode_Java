package 精选面试题;

public class LeetCode191 {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int l;
            int count = 0;
            while (n > 0){
                l = n % 10;
                if(l == 1){
                    count ++;
                }
                n = n /10;
            }
            return count+1;
        }
    }
}

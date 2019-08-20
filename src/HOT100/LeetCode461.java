package HOT100;

public class LeetCode461 {

    /***
     * 执行用时 :2 ms, 在所有 Java 提交中击败了23.90% 的用户
     * 内存消耗 :33.5 MB, 在所有 Java 提交中击败了77.38%的用户
     * TODO 十进制转二进制数 Integer.toBinaryString(x);
     * */
    static class Solution {
        public static int hammingDistance(int x, int y) {
            String binX = Integer.toBinaryString(x);
            String binY = Integer.toBinaryString(y);
            int count = 0;
            boolean flag = binX.length() > binY.length();
            int min = Math.min(binX.length(), binY.length());
            for (int i = 0; i < min; i++) {
                if(binX.charAt(binX.length()-1-i) != binY.charAt(binY.length()-1-i)){
                    count++;
                }
            }
            if(flag){
                for (int i = 0; i < binX.length() - min; i++) {
                    if(binX.charAt(i) != '0'){
                        count++;
                    }
                }
            }else{
                for (int i = 0; i < binY.length() - min; i++) {
                    if(binY.charAt(i) != '0'){
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.hammingDistance(1, 4));
    }
}

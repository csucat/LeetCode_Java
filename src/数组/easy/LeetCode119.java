package 数组.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {
    class Solution {
        /**
         * 执行用时 : 1 ms, 在Pascal's Triangle II的Java提交中击败了98.43% 的用户
         * 内存消耗 : 33.4 MB, 在Pascal's Triangle II的Java提交中击败了32.46% 的用户
         * */
        public List<Integer> getRow(int rowIndex) {
            List<Integer> list = new ArrayList<>(rowIndex+1);
            //使用int会溢出
            long cur = 1;
            for (int i = 0; i <= rowIndex ; i++) {
                //TODO
                /**
                 *为什么用long转int不会溢出?
                 * */
                list.add((int)cur);
                cur = cur *(rowIndex-i)/(i+1);
            }
            return list;
        }
    }
}

package 数组.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
    class Solution {
        /**
         * 执行用时 : 2 ms, 在Pascal's Triangle的Java提交中击败了19.41% 的用户
         * 内存消耗 : 34.2 MB, 在Pascal's Triangle的Java提交中击败了25.94% 的用户
         * */
        public List<List<Integer>> generate(int numRows) {

            List<List<Integer>> lists = new ArrayList<>();
            if(numRows == 0){
                return lists;
            }
            lists.add(new ArrayList<>());
            lists.get(0).add(1);
            for (int i = 1; i < numRows ; i++) {
                List<Integer> row = new ArrayList<>();
                List<Integer> pre = lists.get(i-1);
                row.add(1);
                for (int j = 1; j <i; j++) {
                    row.add(pre.get(j-1)+pre.get(j));
                }
                row.add(1);
                lists.add(row);
            }
            return lists;
        }
    }
}

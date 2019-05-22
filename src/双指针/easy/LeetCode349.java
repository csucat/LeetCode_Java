package 双指针.easy;

import java.util.*;

public class LeetCode349 {
    class Solution {
        /**
         * 执行用时 : 37 ms, 在Intersection of Two Arrays的Java提交中击败了6.92% 的用户
         * 内存消耗 : 36.6 MB, 在Intersection of Two Arrays的Java提交中击败了56.76% 的用户
         * */
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> list = new HashSet<>();
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            for (int i = 0; i <nums1.length ; i++) {
                for (int j = 0; j <nums2.length ; j++) {
                    if(nums1[i] == nums2[j]){
                        list.add(nums2[j]);
                    }
                }
            }
            int[] result = new int[list.size()];
            int i =0;
            for (Integer x:list
                 ) {
                result[i] = x;
                i++;
            }
            return result;
        }
    }
}

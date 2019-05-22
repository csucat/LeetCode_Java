package 数组.easy;

import java.util.*;
/**
     * @Title: Solution.java
     * @Package leetcode.T015_3Sum
     * @Description: TODO
     * @author zhouzhixiang
     * @date 2017-6-7 下午2:03:42
     * @version V1.0
     */
    public class LeetCode15 {
        /**
         * <pre>
         * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
         * Find all unique triplets in the array which gives the sum of zero.
         *
         * Note:
         * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
         * The solution set must not contain duplicate triplets.
         *
         * For example, given array S = {-1 0 1 2 -1 -4},
         * A solution set is:
         * (-1, 0, 1)
         * (-1, -1, 2)
         *
         * 题目大意：
         * 给定一个n个元素的数组，是否存在a，b，c三个元素，使用得a+b+c=0，找出所有符合这个条件的三元组
         *
         * 注意：
         *   - 三元组中的元素必须是非递减的
         *   - 结果不能包含重复元素
         *
         * 思路：
         *
         *
         * </pre>
         *
         * @param
         * @return
         */
        public static void main(String[] args) {
            int[] S = {-1, 0, 1, 2, -1, -4,-3,-4,4,3};
            new LeetCode15().get3Sum(S);
        }

        /**
         * @Title: get3Sum
         * @Description: zhouzhixiang-First
         * @param @param S
         * @param @return
         * @return Set<String>
         * @throws
         */
        public Set<String> get3Sum(int[] S){

            if(S.length<3 || S==null){
                return null;
            }

            //接收拼接的字符串
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<S.length; i++){
                for(int j=0; j<S.length; j++){
                    for(int z=0; z<S.length; z++){
                        //筛选出不是递减的一组元素
                        if(S[i]<=S[j] && S[j]<=S[z]){
                            int sum = S[i] + S[j] + S[z];
                            if(sum==0){
                                String str = "("+S[i]+","+S[j]+","+S[z]+")";
                                sb.append(str+";");
                            }
                        }
                    }
                }
            }

            String s = sb.toString();
            s = s.substring(0, sb.length()-1);
            String[] arr = s.split(";");

            Set<String> set = new HashSet<String>();
            //将所筛选出来的元素放入Set集合中，去重
            for (int k = 0; k < arr.length; k++) {
                set.add(arr[k]);
            }
            System.out.println(set);
            return set;
        }

        /**
         * @Title: threeSum
         * @Description: 参考
         * @param @param nums
         * @param @return
         * @return List<List<Integer>>
         * @throws
         */
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new LinkedList<>();

            if (nums != null && nums.length > 2) {
                // 先对数组进行排序
                Arrays.sort(nums);
                // i表示假设取第i个数作为结果
                for (int i = 0; i < nums.length - 2; ) {
                    // 第二个数可能的起始位置
                    int j = i + 1;
                    // 第三个数可能是结束位置
                    int k = nums.length - 1;

                    while (j < k) {
                        // 如果找到满足条件的解
                        if (nums[j] + nums[k] == -nums[i]) {
                            // 将结果添加到结果含集中
                            List<Integer> list = new ArrayList<>(3);
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            result.add(list);

                            // 移动到下一个位置，找下一组解
                            k--;
                            j++;

                            // 从左向右找第一个与之前处理的数不同的数的下标
                            while (j < k && nums[j] == nums[j - 1]) {
                                j++;
                            }
                            // 从右向左找第一个与之前处理的数不同的数的下标
                            while (j < k && nums[k] == nums[k + 1]) {
                                k--;
                            }
                        }
                        // 和大于0
                        else if (nums[j] + nums[k] > -nums[i]) {
                            k--;
                            // 从右向左找第一个与之前处理的数不同的数的下标
                            while (j < k && nums[k] == nums[k + 1]) {
                                k--;
                            }
                        }
                        // 和小于0
                        else {
                            j++;
                            // 从左向右找第一个与之前处理的数不同的数的下标
                            while (j < k && nums[j] == nums[j - 1]) {
                                j++;
                            }
                        }
                    }

                    // 指向下一个要处理的数
                    i++;
                    // 从左向右找第一个与之前处理的数不同的数的下标
                    while (i < nums.length - 2 && nums[i] == nums[i - 1]) {
                        i++;
                    }
                }
            }

            return result;
        }

    }


package 数组.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *固定两个值，再使用双指针
 * */
public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length > 3){
            for (int i = 0; i <nums.length -3; ) {
                for (int j = i+1; j <nums.length-2; ) {
                    int m = j+1;
                    int n = nums.length-1;
                    while (m < n){
                        if(sum(nums,i,j,m,n,target) == 0){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[m]);
                            list.add(nums[n]);
                            lists.add(list);

                            n--;
                            m++;

                            while(m < n && nums[m] == nums[m-1]){
                                m++;
                            }
                            while(m < n && nums[n] == nums[n+1]){
                                n--;
                            }
                        }else if(sum(nums,i,j,m,n,target) > 0){
                            n--;
                            while(m < n && nums[n] == nums[n+1]){
                                n--;
                            }
                        }else{
                            m++;
                            while(m < n && nums[m] == nums[m-1]){
                                m++;
                            }
                        }
                    }
                    j++;
                    while (j < nums.length - 2 && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
                i++;
                while (i < nums.length - 2 && nums[i] == nums[i - 1]) {
                    i++;
                }
            }
        }
        return lists;
    }
    public int sum(int[] nums,int i,int j,int m,int n,int target){
        if(nums[i] + nums[j] + nums[m] + nums[n] == target){
            return 0;
        }else if(nums[i] + nums[j] + nums[m] + nums[n] > target){
            return 1;
        }else{
            return -1;
        }
    }
}




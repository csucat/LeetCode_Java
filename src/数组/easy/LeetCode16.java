package 数组.easy;

import java.util.Arrays;

public class LeetCode16 {
    public int threeSumClosest(int[] nums, int target) {
        int total = 0;
        Arrays.sort(nums);
        if (nums.length > 2) {
            total = nums[0] + nums[1] + nums[2];
        }
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];
                if (Math.abs(temp - target) < Math.abs(total - target)) {
                    total = temp;
                }
                /**
                 * temp 为中间值，使用temp与target比较，从而确定双指针的移动方向。
                 * */
                if (temp > target) {
                    right--;
                } else if (temp < target) {
                    left++;
                } else {
                    return total;
                }
            }
        }
        return total;
    }

}

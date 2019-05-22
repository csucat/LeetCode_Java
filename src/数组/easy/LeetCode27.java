package 数组.easy;

public class LeetCode27 {
    /**
     * 元素相对顺序不改变的情况
     * */
    public int removeElement(int[] nums, int val) {
        int index = 1;
        for (int i = 0; i <nums.length-1 ; ) {
            if(nums[i] != val){
                i++;
            }else {
                int j = i+1;
                while (j<nums.length-index){
                    nums[j] = nums[j+1];
                    j++;
                }
                index++;
            }
        }
        return nums.length-index;
    }
    /**
     * 元素相对顺序可以改变的情况
     * */
    public int remove_Element(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i<n){
            if(nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            }else {
                i++;
            }
        }
        return n;
    }
}

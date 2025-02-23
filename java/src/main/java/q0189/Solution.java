package q0189;

import java.util.Arrays;

class Solution {
//    比较直接的做法，但需要O(n)空间去储存
//    public void rotate(int[] nums, int k) {
//        int len = nums.length;
//        int cleanedK = k % len;
//        int[] copiedNums = Arrays.copyOf(nums,len);
//        for (int i = 0; i < len; i++) {
//            int index = (len - cleanedK + i) % len;
//            nums[i] = copiedNums[index];
//        }
//    }

//    空间O(1)的做法，比较巧妙不是很直接
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int cleanedK = k % n;
        flip(nums, 0, n);
        flip(nums, 0, cleanedK);
        flip(nums, cleanedK, n);
    }

    private void flip(int[] nums, int start, int end) {
        int left = start, right = end - 1;
        while (left <= right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
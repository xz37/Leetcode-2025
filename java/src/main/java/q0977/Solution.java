package q0977;

import java.util.Arrays;

class Solution {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;

        while (left <= right) {
            int index = left - right + n - 1;
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[n - index - 1] = nums[left] * nums[left];
                left++;
            } else {
                ans[n - index - 1] = nums[right] * nums[right];
                right--;
            }
        }

//        for (int i = n - 1; i >= 0; i--) {
//            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
//                ans[i] = (int) Math.pow(nums[left++], 2);
//            } else {
//                ans[i] = (int) Math.pow(nums[right--], 2);
//            }
//        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-7,-3,2,3,11};
        int[] res = sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }
}

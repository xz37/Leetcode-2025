package q0209;

class Solution {
    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0, right = 0;
        int sum = nums[0];
        int ans = Integer.MAX_VALUE;
        while (left <= right) {
            if (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            } else {
                right++;
                if (right < nums.length) {
                    sum += nums[right];
                } else {
                    break;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1,1};
        int[] nums = new int[]{2,3,1,2,4,3};
        int target = 7;
        int res = minSubArrayLen(target, nums);
        System.out.println(res);
    }
}

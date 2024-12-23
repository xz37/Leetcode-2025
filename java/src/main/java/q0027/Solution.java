package q0027;

class Solution {
    public int removeElement(int[] nums, int val) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index] = tmp;
                index++;
            }
        }
        return index;
    }
}

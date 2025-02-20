package q0941;

class Solution {

    /**
     * This method uses a single pass approach with a flag to track if the peak has been reached.
     */
//    public boolean validMountainArray(int[] arr) {
//        int len = arr.length;
//        if (len < 3) {
//            return false;
//        }
//
//        boolean arrivedPeak = false;
//        for (int i = 1; i < len - 1; i++) {
//            if (arr[i] == arr[i - 1] || arr[i] == arr[i + 1]) {
//                return false;
//            }
//
//            if (!arrivedPeak) {
//                if (arr[i] < arr[i - 1]) {
//                    return false;
//                }
//                if (arr[i] > arr [i + 1]) {
//                    arrivedPeak = true;
//                }
//            } else {
//                if (arr[i] < arr[i + 1]) {
//                    return false;
//                }
//            }
//        }
//        return arr[len - 1] < arr[len - 2];
//    }

    /**
     * This method uses two pointers to find the peak from both ends.
     */
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (len < 3) {
            return false;
        }

        int left = 0, right = arr.length - 1;
        while (left < arr.length - 1 && arr[left] < arr[left + 1]) {
            left++;
        }
        while (right > 0 && arr[right] < arr[right - 1]) {
            right--;
        }
        return left == right && left < len - 1 && right > 0;
    }
}

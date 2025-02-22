package q1207;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int[] counts = new int[2001];
        for (int value : arr) {
            int inddex = value + 1000;
            counts[inddex]++;
        }
        Set<Integer> frequency = new HashSet<>();
        for (int count : counts) {
            if (count == 0) {
                continue;
            }
            if (frequency.contains(count)) {
                return false;
            }
            frequency.add(count);
        }
        return true;
    }
}

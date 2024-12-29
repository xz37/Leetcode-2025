package q1356;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int[] sortByBits(int[] arr) {

        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Comparator<Integer> sortByBitsComparator = (o1, o2) -> getOneNum(o1) - getOneNum(o2) == 0 ? o1 - o2 : getOneNum(o1) - getOneNum(o2);

        Arrays.sort(integerArray, sortByBitsComparator);
        return Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
    }

    private static int getOneNum(Integer num) {
        int ans = 0;
        while (num > 0) {
            ans += (num & 1);
            num >>= 1;
        }
        return ans;
    }
}

package q0844;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        int p1 = s.length() - 1, p2 = t.length() - 1;
        while (p1 >= 0 || p2 >= 0) {
            p1 = getFirstNonhashIndex(s, p1);
            p2 = getFirstNonhashIndex(t, p2);

            if (p1 >= 0 && p2 >= 0) {
                if (s.charAt(p1) != t.charAt(p2)) {
                    return false;
                } else {
                    p1 -= 1;
                    p2 -= 1;
                }
            } else if (p1 < 0 && p2 < 0) {
                return true;
            } else {
                if ((p1 >= 0 && s.charAt(p1) != '#') || (p2 >= 0 && t.charAt(p2) != '#')) {
                    return false;
                }
            }
        }
        return true;
    }

    private int getFirstNonhashIndex(String str, int p) {
        if (p < 0) return p;

        int numHash = 0;
        while (str.charAt(p) == '#' || numHash > 0) {
            if (str.charAt(p) == '#') {
                numHash++;
            } else {
                numHash--;
            }
            p -= 1;
            if (p < 0) {
                break;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
//        String s = "nzp#o#g";
//        String t = "b#nzp#o#g";
//        String s = "bxj##tw";
//        String t = "bxj###tw";
        String s = "a#c###";
        String t = "ad#c";
        boolean res = sol.backspaceCompare(s, t);
        System.out.println(res);
    }
}

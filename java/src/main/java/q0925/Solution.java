package q0925;

class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int p1 = 0, p2 = 0;

        while (p1 < name.length() || p2 < typed.length()) {

            if (p1 == name.length()) {
                while (p2 < typed.length()) {
                    if (typed.charAt(p2++) != name.charAt(p1 - 1)) {
                        return false;
                    }
                }
                return true;
            } else if (p2 == typed.length()) {
                return false;
            } else {
                if (name.charAt(p1) == typed.charAt(p2)) {
                    p1++;
                    p2++;
                } else if (p1 > 0 && name.charAt(p1 - 1) == typed.charAt(p2)) {
                    p2++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

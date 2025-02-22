package q0459;

class Solution {
    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s).append(s);
        String duplicatedString = sb.substring(1, sb.length() - 1);
        int index = duplicatedString.indexOf(s);
        return index != -1;
    }

    public static void main(String[] args) {
        String s = "aba";
        boolean ans = repeatedSubstringPattern(s);
        System.out.println(ans);
    }
}

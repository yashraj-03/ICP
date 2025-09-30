public class permutation_in_string {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int[] map = new int[26];
            for (char c : s1.toCharArray()) map[c - 'a']++;
            int i = 0, j = 0;
            int count_chars = s1.length();
            while (j < s2.length()) {
                if (map[s2.charAt(j) - 'a']-- > 0) {
                    count_chars--;
                }
                j++;
                if (count_chars == 0) return true;
                if (j - i == s1.length()) {
                    if (map[s2.charAt(i) - 'a']++ >= 0) {
                        count_chars++;
                    }
                    i++;
                }
            }
            return false;
        }
    }
}
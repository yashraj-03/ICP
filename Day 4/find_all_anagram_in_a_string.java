public class find_all_anagram_in_a_string {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList<>();
            if (s.length() < p.length()) return result;
            int[] map = new int[26];
            for (char c : p.toCharArray()) {
                map[c - 'a']++;
            }
            int left = 0, right = 0, count = p.length();
            while (right < s.length()) {
                // consume right char
                if (map[s.charAt(right) - 'a']-- > 0) {
                    count--;
                }
                right++;
                if (count == 0) {
                    result.add(left);
                }
                if (right - left == p.length()) {
                    if (map[s.charAt(left) - 'a']++ >= 0) {
                        count++;
                    }
                    left++;
                }
            }
            return result;
        }
    }
}
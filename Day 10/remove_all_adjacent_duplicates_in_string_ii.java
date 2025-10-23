public class remove_all_adjacent_duplicates_in_string_ii {
    class Solution {
        static class Pair {
            char ch;
            int count;
            Pair(char ch, int count) {
                this.ch = ch;
                this.count = count;
            }
        }
        public String removeDuplicates(String s, int k) {
            Stack<Pair> stk = new Stack<>();
            for(char c: s.toCharArray()){
                if(!stk.isEmpty() && stk.peek().ch==c){
                    stk.peek().count++;
                    if (stk.peek().count == k) {
                        stk.pop();
                    }
                }
                else {
                    stk.push(new Pair(c, 1));
                }
            }
            StringBuilder res = new StringBuilder();
            for (Pair p : stk) {
                for (int i = 0; i < p.count; i++) {
                    res.append(p.ch);
                }
            }

            return res.toString();
        }
    }
}
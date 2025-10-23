public class decode_string {
    class Solution {
        public String decodeString(String s) {
            Stack<Integer> cnt = new Stack<>();
            Stack<StringBuilder> stk = new Stack<>();
            StringBuilder curr = new StringBuilder();
            int k = 0;
            for (char ch : s.toCharArray()) {
                if (Character.isDigit(ch)) {
                    k = k * 10 + (ch - '0');
                } else if (ch == '[') {
                    cnt.push(k);
                    stk.push(curr);
                    curr = new StringBuilder();
                    k = 0;
                } else if (ch == ']') {
                    int repeat = cnt.pop();
                    StringBuilder decoded = stk.pop();
                    for (int i = 0; i < repeat; i++) {
                        decoded.append(curr);
                    }
                    curr = decoded;
                } else {
                    curr.append(ch);
                }
            }

            return curr.toString();
        }
    }
}
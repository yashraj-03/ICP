public class basic_calculator_ii {
    class Solution {
        public int calculate(String s) {
            if(s==null || s.length()==0){
                return 0;
            }
            int n=s.length();
            int num=0;
            char sign='+';
            Stack<Integer> stk = new Stack();
            for(int i=0; i<n; i++){
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                }
                if ((!Character.isDigit(c) && c != ' ') || i == n - 1) {
                    if (sign == '+') {
                        stk.push(num);
                    }
                    else if (sign == '-') {
                        stk.push(-num);
                    }
                    else if (sign == '*') {
                        stk.push(stk.pop() * num);
                    }
                    else if (sign == '/') {
                        stk.push(stk.pop() / num);
                    }
                    sign=c;
                    num=0;
                }
            }
            int res = 0;
            for (int val : stk) {
                res += val;
            }
            return res;
        }
    }
}
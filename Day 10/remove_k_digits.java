public class remove_k_digits {
    class Solution {
        public String removeKdigits(String num, int k) {
            StringBuilder stk = new StringBuilder();
            for(char digit: num.toCharArray()){
                while(k>0 && stk.length()>0 && stk.charAt(stk.length()-1)>digit){
                    stk.deleteCharAt(stk.length()-1);
                    k--;
                }
                stk.append(digit);
            }
            while (k > 0 && stk.length() > 0) {
                stk.deleteCharAt(stk.length() - 1);
                k--;
            }
            int i = 0;
            while (i < stk.length() && stk.charAt(i) == '0') {
                i++;
            }
            String res = (i == stk.length()) ? "0" : stk.substring(i);
            return res;
        }
    }
}
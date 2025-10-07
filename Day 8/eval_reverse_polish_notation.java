public class eval_reverse_polish_notation {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stk = new Stack<>();
            for(String token: tokens){
                if(token.equals("+")){
                    int b=stk.pop();
                    int a=stk.pop();
                    stk.push(a+b);
                }
                else if(token.equals("-")){
                    int b=stk.pop();
                    int a=stk.pop();
                    stk.push(a-b);
                }
                else if(token.equals("*")){
                    int b=stk.pop();
                    int a=stk.pop();
                    stk.push(a*b);
                }
                else if(token.equals("/")){
                    int b=stk.pop();
                    int a=stk.pop();
                    stk.push(a/b);
                }
                else{
                    stk.push(Integer.parseInt(token));
                }
            }
            return stk.pop();
        }
    }
}
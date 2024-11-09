class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(isOperator(token)){
                int num2 = stack.pop();
                int num1 = stack.pop();

                if(token.equals("+")){
                    stack.push(num1 + num2);
                }else if(token.equals("-")){
                    stack.push(num1 - num2);
                }else if(token.equals("*")){
                    stack.push(num1 * num2);
                }else if(token.equals("/")){
                    stack.push(num1 / num2);
                }
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static boolean isOperator(String tokens){
        return tokens.equals("+") || tokens.equals("-") || tokens.equals("*") || tokens.equals("/");

    }
}
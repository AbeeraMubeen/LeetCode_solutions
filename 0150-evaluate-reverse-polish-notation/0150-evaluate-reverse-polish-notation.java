
        class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // if it's an operator
            if (token.equals("+") || token.equals("-") 
                || token.equals("*") || token.equals("/")) {

                int b = stack.pop(); 
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b); // truncates toward zero
                        break;
                }
            } else {
                // number -> push
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
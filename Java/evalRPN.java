class Solution {
    static int i;
    
    public static int evalRPN(String[] tokens) {
        i = tokens.length - 1;
        return eval(tokens);
    }
    
    static int eval(String[] ss) {
        switch (ss[i--]) {
            case "+":
                return eval(ss) + eval(ss);                
            case "-":
                return - eval(ss) + eval(ss);
            case "*":
                return eval(ss) * eval(ss);
            case "/":
                return (int) (1.0 / eval(ss) * eval(ss));
            default:
                return Integer.valueOf(ss[i + 1]);
        }
    }

    public static void main(String[] args){
        String[] t;
        t = new String[] {"2","1","+","3","*"};
        int result = evalRPN(t);
        System.out.println("Array " + Arrays.toString(t) + " gives " + result);
    }
}
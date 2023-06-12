import java.util.Stack;

public class FactorialI {

    public static int factorialIterativoStack(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        for (int i = 2; i <= n; i++) {
            stack.push(stack.peek() * i);
        }
        return stack.pop();
    }


    public static int factorialRecursivo(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        int resultado = 1;
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num == 0) {
                resultado *= 1;
            } else {
                resultado *= num;
                stack.push(num - 1);
            }
        }
        return resultado;
    }
}

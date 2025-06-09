package Ejercicio_01_sing;

import java.util.Stack;

public class SignValidator {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;

                char abierto = stack.pop();
                if ((c == ')' && abierto != '(') ||
                    (c == '}' && abierto != '{') ||
                    (c == ']' && abierto != '[')) {
                    return false;
                }
            } else {
                return false; // Caracter no permitido
            }
        }
        
        return stack.isEmpty();
    }
}

package Ejercicio_02_sorting;

import java.util.Stack;

import Materia.controllers.StackG;

public class StackSorter {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!aux.isEmpty() && aux.peek() > temp) {
                stack.push(aux.pop());
            }

            aux.push(temp);
        }

        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
    }
    public static void printStack(Stack<Integer> stack) {
        System.out.println(" "+stack);
    }

}

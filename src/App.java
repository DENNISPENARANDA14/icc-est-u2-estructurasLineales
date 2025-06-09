import Ejercicio_01_sing.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.controllers.StackG;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // Stack stack = new Stack();
        // stack.push(10);
        // stack.push(-1);
        // stack.push(5);
        // stack.push(8);
        // System.out.println("Tam = " + stack.size());
        // stack.printStacks();
        // stack.pop();
        // System.out.println("Tam = " + stack.size());
        // stack.printStacks();

        // 8 | 5 | -1 | 10
        // 5 | -1 | 10

        // StackG<Integer> pilaG = new StackG<Integer>();
        // pilaG.push(10);
        // pilaG.push(8);
        // pilaG.push(-1);
        // pilaG.push(5);
        // System.out.println("Tam = " + pilaG.size());
        // pilaG.printStacks();
        // pilaG.pop();
        // System.out.println("Tam = " + pilaG.size());
        // pilaG.printStacks();

        // Tam = 4
        // 5 | 10 | -1 | 8
        // 10 | -1 | 8

        // Persona p1 = new Persona("Juan");
        // Persona p2 = new Persona("Maria");
        // Persona p3 = new Persona("Pedro");
        // Persona p4 = new Persona("David");

        // QueueG <Persona> colaPersonas = new QueueG<Persona>();
        // colaPersonas.add(p1);
        // colaPersonas.add(p2);
        // colaPersonas.add(p3);
        // colaPersonas.add(p4);
        // colaPersonas.printCola();
        // System.out.println("Persona atendida -> " + colaPersonas.remove());
        // colaPersonas.printCola();

        // Juan | Maria | Pedro
        // Persona atendida -> Juan
        // Maria | Pedro

    // Persona pB = colaPersonas.findByName("Juan");
    // System.out.println("Persona encontrada -> " + (pB != null ? pB : "ninguna"));
    // colaPersonas.printCola();

    // Persona pE = colaPersonas.deleteByName("Pedro");
    // System.out.println("Persona eliminada -> " + (pE != null ? pE : "ninguna"));
    // colaPersonas.printCola();


        // Juan | Maria | Pedro | David
        // Persona atendida -> Juan
        // Maria | Pedro | David
        // Persona encontrada -> ninguna
        // Persona eliminada -> Pedro
        // Maria |
    
    // Prueba ejercicio 1
    String prueba1 = "([]){}";
        System.out.println(prueba1 + " → " + SignValidator.isValid(prueba1)); // true
    
    String prueba2 = "({)}";
        System.out.println(prueba2 + " → " + SignValidator.isValid(prueba2)); // false
    
    /* Prueba ejercicio 2
    StackG<Integer> pila = new StackG<>();
    pila.push(5);
    pila.push(1);
    pila.push(4);
    pila.push(2);
    
    System.out.println("Antes de ordenar: ");
    StackSorter.printStack(pila);
    System.out.println("Pila ordenada");
    StackSorter.printStack(StackSorter.sortStack(pila)); 
    // Pila ordenada: 1 2 4 5*/

    // Ejercicio 2: Ordenar un stack
    Stack<Integer> stack = new Stack<>();
    stack.push(5);
    stack.push(1);
    stack.push(4);
    stack.push(2);

    System.out.println("Pila antes de ordenar: ");
    StackSorter.printStack(stack);
    StackSorter.sortStack(stack);
    System.out.println("Stack después de ordenar: ");
    StackSorter.printStack(stack);
   }
}

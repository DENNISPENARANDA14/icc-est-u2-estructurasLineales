package Materia.controllers;

import java.util.EmptyStackException;

import Materia.models.Node;

public class Stack {

    private Node top; // Nodo cima de la pila

    public Stack(){
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop( ){
        if (isEmpty()){
           throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public int peek(){
        if (isEmpty()){
           throw new EmptyStackException();
        }
        int value = top.getValue();
        return value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStacks(){
        Node aux = top;
        while (aux != null) {
            System.out.println(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public int size(){
        int count = 0;
        Node aux = top;
        while (aux != null) {
            count++;
            aux = aux.getNext();
        }
        return count;
    }

}

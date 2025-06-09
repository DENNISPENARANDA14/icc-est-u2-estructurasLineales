package Materia.controllers;

import java.util.EmptyStackException;

import Materia.models.NodeGeneric;

public class StackG <T>{
    
    private NodeGeneric<T> top;
    private int size;

    public StackG() {
        this.top = null;
        this.size = 0;
    }

    public int push(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
        return size;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStacks() {
        NodeGeneric<T> aux = top;
        while (aux != null) {
            System.out.println(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public int size() {
        return size;
    }


}

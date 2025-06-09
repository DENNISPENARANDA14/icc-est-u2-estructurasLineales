package Materia.controllers;

import java.util.EmptyStackException;

import Materia.models.NodeGeneric;

public class QueueG<T> {
    private NodeGeneric<T> front;
    private NodeGeneric<T> back;
    private int size;

    public QueueG() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            front = back = newNode;
        } else {
            back.setNext(newNode);
            back = newNode;
        }
        size++;
    }

    public int push(T value) {
        add(value);
        return size;
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T value = front.getValue();
        front = front.getNext();
        size--;
        if (isEmpty()) back = null;
        return value;
    }

    public T remove() {
        return pop();
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return front.getValue();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printCola() {
        NodeGeneric<T> aux = front;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println(); 
    }


    public int size() {
        return size;
    }

    public T findByName(String name) {
        NodeGeneric<T> current = front;
        while (current != null) {
            if (current.getValue() instanceof Materia.models.Persona) {
                Materia.models.Persona p = (Materia.models.Persona) current.getValue();
                if (p.getName().equalsIgnoreCase(name)) {
                    return current.getValue();
                }
            }
            current = current.getNext();
        }
        return null;
    }

    public T deleteByName(String name) {
        if (isEmpty()) throw new EmptyStackException();
        NodeGeneric<T> current = front, previous = null;

        while (current != null) {
            if (current.getValue() instanceof Materia.models.Persona) {
                Materia.models.Persona p = (Materia.models.Persona) current.getValue();
                if (p.getName().equalsIgnoreCase(name)) {
                    if (previous == null) {
                        front = current.getNext();
                        if (front == null) back = null;
                    } else {
                        previous.setNext(current.getNext());
                        if (current.getNext() == null) back = previous;
                    }
                    size--;
                    return current.getValue();
                }
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }
}

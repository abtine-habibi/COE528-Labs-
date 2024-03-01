/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab4;

import java.util.LinkedList;



public class Queue<T> {
    //Overview: Queue is mutable, bounded, collection of objects that operate in FIFO (First In First Out)
    
    // Abstraction Function: AF(elements) = a queue containing objects of any data type. The elements are added in the rear and deleted from the top.
    
    // Representation Invariant: The queue must not be null, and its elements must be distinct.

    // Representation
    private LinkedList<T> elements;

    // Constructor
    public Queue() {
        elements = new LinkedList<>();
    }

    // Effects: Adds the specified element to the rear of the queue.
    // Modifies: this
    public void enqueue(T element) {
        elements.addLast(element);
    }

    // Effects: Removes and returns the element at the front of the queue.
    // Throws IllegalStateException if the queue is empty.
    // Modifies: this
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }
    
    // Effects: Returns true if the queue is empty, false otherwise.
    // Modifies: nothing
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Effects: Returns true if the representation invariant holds for this queue, false otherwise.
    // Modifies: nothing
    public boolean repOK() {
         for (T element : elements) {
            if (element == null) {
                return false;
            }
        }

        // Check if elements are distinct
        for (int i = 0; i < elements.size() - 1; i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                if (elements.get(i).equals(elements.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return elements.toString();
    }


    
    public static void main(String[] args) {
        // Test the queue implementation
        Queue<Integer> queue = new Queue<>();
        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        // Dequeue elements
        int dequeuedElement1 = queue.dequeue(); // 10
        int dequeuedElement2 = queue.dequeue(); // 20
        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty(); // false
        // Expected output
        System.out.println("Dequeued element 1: " + dequeuedElement1);
        System.out.println("Dequeued element 2: " + dequeuedElement2);
        System.out.println("Is the queue empty? " + isEmpty);
}
}

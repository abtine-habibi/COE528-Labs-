package coe528.lab4;

import java.util.ArrayList;


public class StackOfDistinctStrings {
    // Overview: StacksOfDistinctStrings are mutable, bounded
    // collection of distinct strings that operate in
    // LIFO (Last-In-First-Out) order.
    //
    // Abstraction function:
    // Represents a stack of distinct strings where the top of the stack
    // corresponds to the last string added.
    //
    // Rep invariant:
    // - 'items' contains distinct strings
    // - No null elements in 'items'

    private ArrayList<String> items; // the rep

    // constructor
    public StackOfDistinctStrings() {
        // EFFECTS: Creates a new StackOfDistinctStrings object
        items = new ArrayList<>();
    }

    public void push(String element) throws Exception {
        // MODIFIES: this
        // EFFECTS: Appends the element at the top of the stack
        // if the element is not in the stack, otherwise
        // does nothing.
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null.");
        }
        if (!items.contains(element)) {
            items.add(element);
        }
    }

    public String pop() throws Exception {
        // MODIFIES: this
        // EFFECTS: Removes an element from the top of the stack
        if (items.isEmpty()) {
            throw new Exception("Stack is empty.");
        }
        return items.remove(items.size() - 1);
    }

    public boolean repOK() {
        // EFFECTS: Returns true if the rep invariant holds for this
        // object; otherwise returns false
        // Rep invariant: All strings in 'items' are distinct and not null
        for (String s : items) {
            if (s == null || items.indexOf(s) != items.lastIndexOf(s)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        // EFFECTS: Returns a string representation of the stack.
        StringBuilder sb = new StringBuilder();
        if (items.isEmpty()) {
            sb.append("Stack is empty.");
        } else {
            for (int i = 0; i < items.size(); i++) {
                sb.append(items.get(i));
                if (i != items.size() - 1) {
                    sb.append("\n");
                }
            }
            sb.append("\nTop: ").append(items.get(items.size() - 1));
        }
        return sb.toString();
    }
}

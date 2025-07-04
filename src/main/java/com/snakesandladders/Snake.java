package com.snakesandladders;

public class Snake {
    private final int head;
    private final int tail;

    public Snake(int head, int tail) {
        if (tail >= head) throw new IllegalArgumentException("Invalid Snake");
        this.head = head;
        this.tail = tail;
    }

    public int getHead() {
        return head;
        }
    public int getTail() { 
        return tail; 
        
    }
}
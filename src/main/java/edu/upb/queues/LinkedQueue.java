/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.queues;

import edu.upb.models.IQueue;
import edu.upb.models.MyException;
import edu.upb.models.Node;

/**
 *
 * @author cahuc
 */
public class LinkedQueue implements IQueue {

    private Node head = null;
    private Node tail = null;

    @Override
    public void enqueue(Object item) {
        
        head = new Node(item, head);
        
        if(tail == null){
            tail = head;
        }
        
        item = tail.next;
        item = tail;
    }

    @Override
    public Object dequeue() {
        
        if (head == null){
            throw new MyException("Cannot remove from empty queue.");
        }
        
        Node item = head;
        head = head.next;
        
        if (head == null){
            tail = null;
        }
        
        return item;
    }

    @Override
    public Object peek() {
        
        if (head == null) {
            throw new MyException("Cannot peek from empty stack");
        }
        
        return head.data;
    }

    @Override
    public int size() {
        int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

}

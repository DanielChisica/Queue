/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue1;

/**
 * This class creates a Node, this is a kind of object that have a element and a
 * refference, at the same time the refference is other Node
 * @author Daniel Jiménez
 * @param <T> Generic Data Type
 * @since 10 March 2017
 */
public class Node <T>{
    
    /**
     * The costructor can build the node with the imput attributes
     * @param element The object of the node
     * @param next 
     */
    public Node(T element, T next) {
        this.element = element;
        this.next = next;
    }

    public Node(T element) {
        this.element = element;
    }
    
    
    
    /**
     * 
     * @return 
     */
    public T getElement() {
        return element;
    }
    
    /**
     * 
     * @param element 
     */
    public void setElement(T element) {
        this.element = element;
    }
    
    /**
     * 
     * @return 
     */
    public T getNext() {
        return next;
    }
    
    /**
     * 
     * @param next 
     */
    public void setNext(T next) {
        this.next = next;
    }
   private T element;
   private T next;
}


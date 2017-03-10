/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue1;

/**
 * This class configurates a queue with its methods
 * @since 10 March 2017
 * @author Daniel Jimenez
 */
public class Queue {
    private Node node;
    
    /**
     * Adds a element to the queue
     * @param element The element to be put in the queue
     */
    public void addtoQueue(Object element){
        if (isEmpty()) {
           node.setElement(element);
        }
        else{
            node.setNext(element);
        }
    }
    
    /**
     * Gets the first element on the Queue
     * @return The first element added on the queue
     */
    public Object unPack(){
        Node n=new Node(node.getElement());
        node=(Node)node.getNext();
        
        return n;
    }
    
    /**
     * Asks to the node if it has next
     * @return True if the node reffers to an other object
     */
    public boolean hasNext(){
        return node.getNext()==null;
    }
    
    /**
     * Asks to the node if has next refference
     * @return 
     */
    public boolean isEmpty(){
        return node==null;
    }
    
}

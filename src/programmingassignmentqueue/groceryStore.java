/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignmentqueue;

/**
 *
 * @author Jay Yadav
 */

public class groceryStore {
    private Customer first; // First customer
    private Customer last; // last customer
    private int intQueue = 0; // varibale to count the number of people in the queue
    private int intServed = 0; // variable to count the number of people served
    
  
    public int getServed() {
        return intServed;
    }
    public int getLength() {
        return intQueue;
    }
    
    public boolean isEmpty() {
        return first == null;
    }

    public Customer getFirst() {
        return first;
    }
    
    
   
    public void enqueue (Customer c) {
        // Adds Customer c to the back of the queue
        
        //if the queue is empty, first should refere to the new object.
        if(isEmpty()) {
            first = c;
        } else {
            //sets the current last object to point to the new object
            last.setNext(c);
        }
        // Last should always refere to the new object 
        last = c;
        // Increment the queue counter
        // so that we know the total number of people in line
        intQueue++;
    }
    
    public Customer dequeue () {
        // Remove and Return the first customer in the queue
        if (isEmpty() ) {
            System.out.println("The Queue is empty"); 
            return null;
        }
        // Store a temp reference, so that we can remove the object.
        Customer temp = first;
        // and then remove the first object by setting first to temp.
        first = first.getNext();
        // if the queue is now empty set the last to null.
        if (isEmpty()) {
            last = null;
        }
        // decrement the queue because that customer has been serviced.
        intQueue--;
        // incrmenet the total of customers serviced
        intServed++;
        return temp;
    }
    
}

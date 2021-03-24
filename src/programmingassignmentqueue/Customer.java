/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignmentqueue;

/**
 *
 * @author jay yadav
 */

import java.util.*;
public class Customer {

    private int serviceTime; 				// ServiceTime for this Customer
    private Customer next;

    /// Constructor
    public Customer() {
        serviceTime = new Random().nextInt(5) + 1;	// Randomly assign required service time 1-5
        next = null;
    }

    // Getter for next Customer in list
    public Customer getNext() {
        return next;
    }

    // Setter for next reference
    public void setNext(Customer c) {
        next = c;
    }

    /// Getter for ServiceTime
    public int getServiceTime() {
        return serviceTime;
    }

    /// Decrement ServiceTime by 1
    public void decServiceTime() {
        serviceTime--;
    }
}

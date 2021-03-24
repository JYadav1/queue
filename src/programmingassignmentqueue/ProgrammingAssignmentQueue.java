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
import java.util.*;

public class ProgrammingAssignmentQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        groceryStore queue = new groceryStore();
        Random randNum = new Random();
        int max_length = 0; // variable for the max line length 
        // simulates 60 minutes 
        for (int time = 0; time <=60; time++) {
            int randN = randNum.nextInt(4) + 1; // generates a random number from 1-4
            // create an if statment to add the customer 25% of the time
            if (randN == 4) {
                queue.enqueue(new Customer()); // crate a new cusmtome in the queue
                System.out.println( " New Customer added! The Queue length is now " + queue.getLength());
                
            }
            // if statmenet dequeues if the length is greater than 0 and service time greater than 0
            if(queue.getLength() > 0 && queue.getFirst().getServiceTime() == 0) {
                queue.dequeue();
                System.out.println(" Customer has been completely serviced and removed " + queue.getLength());
            }

            
            System.out.println("---------------------------------------------------");
            // 
            if (queue.getLength() > 0) {
                queue.getFirst().decServiceTime();
            }
            // checks the queue in order to get the max length of the queue at a given time 
            if (queue.getLength() > max_length) {
                max_length = queue.getLength();
            }
        }
        System.out.println( " Number of customers served is " + queue.getServed());
        System.out.println( " Maximum line length during the simulation " + max_length);

    }

}

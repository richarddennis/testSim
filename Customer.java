/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

/**
 *
 * @author Rich
 */
/**
 * A bank customer.
 */
public class Customer {

    private double arrivalTime;

    /**
     * Constructs a customer.
     *
     * @param the time at which the customer entered the bank
     */
    public Customer(double time) {
        arrivalTime = time;
    }

    /**
     * Gets the time at which the customer entered the bank.
     *
     * @return the arrival time
     */
    double getArrivalTime() {
        return arrivalTime;
    }
}

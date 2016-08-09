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
 * This event describes a customer departing from a teller.
 */
public class Departure extends Event {

    private int teller;

    /**
     * @param time the departure time
     * @param teller the teller holding the customer
     */
    public Departure(double time, int teller) {
        super(time);
        this.teller = teller;
    }

    public void process(Simulation sim) {
        BankSimulation bank = (BankSimulation) sim;
        bank.remove(teller);
    }
}

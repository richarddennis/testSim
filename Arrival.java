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
 * This event describes a customer arriving at a bank.
 */
public class Arrival extends Event {

    /**
     * @param time the arrival time
     */
    public Arrival(double time) {
        super(time);
    }

    public void process(Simulation sim) {
        double now = sim.getCurrentTime();
        BankSimulation bank = (BankSimulation) sim;
        Customer c = new Customer(now);
        bank.add(c);
    }
}

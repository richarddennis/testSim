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
import java.util.PriorityQueue;

public class Simulation {

    public static void main(String[] args) {
        final double START_TIME = 9 * 60; // 9 a.m.
        final double END_TIME = 17 * 60; // 5 p.m.
        final int NTELLERS = 5;
        Simulation sim = new BankSimulation(NTELLERS);
        sim.addEvent(new Arrival(START_TIME));
        sim.run(START_TIME, END_TIME);
    }

    private PriorityQueue<Event> eventQueue;
    private double currentTime;

    /**
     * Constructs a discrete event simulation.
     */
    public Simulation() {
        eventQueue = new PriorityQueue<Event>();
    }

    public double getCurrentTime() {
        return currentTime;
    }

    /**
     * Compute exponentially distributed random numbers.
     *
     * @param mean the mean of the number sequence
     * @return a random number
     */
    public static double expdist(double mean) {
        return -mean * Math.log(1 - Math.random());
    }

    /**
     * Adds an event to the event queue.
     *
     * @param evt the event to add
     */
    public void addEvent(Event evt) {
        eventQueue.add(evt);
    }

    /**
     * Displays intermediate results after each event.
     */
    public void display() {
    }

    /**
     * Displays summary results after the end of the simulation.
     */
    public void displaySummary() {
    }

    public void run(double startTime, double endTime) {
        currentTime = startTime;

        while (eventQueue.size() > 0 && currentTime <= endTime) {
            Event event = eventQueue.remove();
            currentTime = event.getTime();
            event.process(this);
            display();
        }
        displaySummary();
    }
}

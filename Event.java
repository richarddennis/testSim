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
public class Event implements Comparable<Event> {

    private double time;

    public Event(double eventTime) {
        time = eventTime;
    }

    public void process(Simulation sim) {
    }

    public double getTime() {
        return time;
    }

    public int compareTo(Event other) {
        if (time < other.time) {
            return -1;
        } else if (time > other.time) {
            return 1;
        } else {
            return 0;
        }
    }
}

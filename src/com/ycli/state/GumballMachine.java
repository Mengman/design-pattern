package com.ycli.state;

import com.ycli.proxy.server.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by yucai on 2017/3/13.
 * Email: yucai.li@hpe.com
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;
    private String location;

    public GumballMachine(String location, int count) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.location = location;
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank () {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    @Override
    public String toString() {
        return "\nMighty Gumball, Inc.\nJava-enabled standing Gumball Model #2004" +
                "\nInventory: " + count + " gumballs" +
                "\nMachine is waiting for quarter\n";
    }
}

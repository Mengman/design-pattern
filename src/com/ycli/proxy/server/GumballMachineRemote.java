package com.ycli.proxy.server;

import com.ycli.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by yucai on 2017/3/16.
 * Email: yucai.li@hpe.com
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}

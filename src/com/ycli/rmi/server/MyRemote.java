package com.ycli.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by yucai on 2017/3/13.
 * Email: yucai.li@hpe.com
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}

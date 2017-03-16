package com.ycli.proxy;

import com.ycli.proxy.server.GumballMachineRemote;
import com.ycli.state.GumballMachine;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by yucai on 2017/3/13.
 * Email: yucai.li@hpe.com
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine;
        int count;
         if (args.length < 2) {
             System.out.println("GumballMachine <name> <inventory>");
             System.exit(1);
         }

         try {
             count = Integer.parseInt(args[1]);
             gumballMachine = new GumballMachine(args[0], count);
             Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
         } catch (RemoteException e) {
             e.printStackTrace();
         } catch (MalformedURLException e) {
             e.printStackTrace();
         }
    }
}

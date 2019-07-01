/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import Service.impl.serviceImpl;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimesha
 */
public class Main {
    public static void main(String[] args) {
        try {
            Registry serviceimpl= LocateRegistry.createRegistry(5050);
            System.out.println("Server is started");
            serviceimpl.rebind("ijse",  new serviceImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

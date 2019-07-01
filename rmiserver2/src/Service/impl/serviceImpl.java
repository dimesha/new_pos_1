/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import observer.Observer;
import rmicommon.ServiceInterface;

/**
 *
 * @author dimesha
 */
public class serviceImpl extends UnicastRemoteObject implements Remote,ServiceInterface{
private static ArrayList<Observer>allabserver=new ArrayList<>();
    public serviceImpl() throws RemoteException{

    }

    @Override
    public void register(Observer ob) throws RemoteException {
     allabserver.add(ob);
    }

    @Override
    public void Unregister(Observer ob) throws RemoteException {
      allabserver.remove(ob);
    }

    @Override
    public void notyfyall(String messege) throws RemoteException {
             for (Observer observer : allabserver) {
                 new Thread(
                 new Runnable() {
                     @Override
                     public void run() {
                         try {
                             observer.update(messege);
                         } catch (RemoteException ex) {
                             Logger.getLogger(serviceImpl.class.getName()).log(Level.SEVERE, null, ex);
                         }
                     }
                 }
                 ).start();
                 
        }
    }

    @Override
    public void checkmessege(String mesege) throws RemoteException {
              System.out.println(mesege);
              
    }
    
}

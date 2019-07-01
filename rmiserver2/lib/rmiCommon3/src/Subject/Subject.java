/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subject;

import java.rmi.RemoteException;
import observer.Observer;

/**
 *
 * @author dimesha
 */
public interface Subject {
    public void register(Observer ob)throws RemoteException;
     public void Unregister(Observer ob)throws RemoteException;
      public void notyfyall(String messege)throws RemoteException;
}

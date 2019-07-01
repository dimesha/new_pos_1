/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.rmi.RemoteException;

/**
 *
 * @author dimesha
 */
public interface Observer {
    public void update(String messege)throws RemoteException;
}

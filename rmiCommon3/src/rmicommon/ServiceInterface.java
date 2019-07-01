/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicommon;

import Subject.Subject;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author dimesha
 */
public interface ServiceInterface extends Remote,Subject{
    public void checkmessege(String mesege)throws RemoteException;
}

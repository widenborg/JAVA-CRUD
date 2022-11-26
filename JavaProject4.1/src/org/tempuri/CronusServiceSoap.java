/**
 * CronusServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface CronusServiceSoap extends java.rmi.Remote {
    public org.tempuri.CRONUS_Sverige_AB_Employee[] getEmployees() throws java.rmi.RemoteException;
    public org.tempuri.CRONUS_Sverige_AB_Employee getEmployee(java.lang.String empID) throws java.rmi.RemoteException;
    public void insertEmployee(java.lang.String empID, java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException;
    public void updateEmployee(java.lang.String empID, java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException;
    public void deleteEmployee(java.lang.String empID) throws java.rmi.RemoteException;
}

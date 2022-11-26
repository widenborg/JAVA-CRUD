/**
 * OverflowServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface OverflowServiceSoap extends java.rmi.Remote {
    public java.lang.String helloUser() throws java.rmi.RemoteException;
    public org.tempuri.Student[] studentCollection() throws java.rmi.RemoteException;
    public org.tempuri.Course[] courseCollection() throws java.rmi.RemoteException;
    public org.tempuri.Teacher[] teacherCollection() throws java.rmi.RemoteException;
    public org.tempuri.StudentLoan[] studentLoanCollection() throws java.rmi.RemoteException;
    public org.tempuri.Studies[] studiesCollection() throws java.rmi.RemoteException;
    public org.tempuri.HasStudied[] hasStudiedCollection() throws java.rmi.RemoteException;
    public org.tempuri.WorksOn[] worksOnCollection() throws java.rmi.RemoteException;
    public org.tempuri.Vehicle[] vehicleCollection() throws java.rmi.RemoteException;
}

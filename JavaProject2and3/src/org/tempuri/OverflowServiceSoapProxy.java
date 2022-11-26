package org.tempuri;

public class OverflowServiceSoapProxy implements org.tempuri.OverflowServiceSoap {
  private String _endpoint = null;
  private org.tempuri.OverflowServiceSoap overflowServiceSoap = null;
  
  public OverflowServiceSoapProxy() {
    _initOverflowServiceSoapProxy();
  }
  
  public OverflowServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initOverflowServiceSoapProxy();
  }
  
  private void _initOverflowServiceSoapProxy() {
    try {
      overflowServiceSoap = (new org.tempuri.OverflowServiceLocator()).getOverflowServiceSoap();
      if (overflowServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)overflowServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)overflowServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (overflowServiceSoap != null)
      ((javax.xml.rpc.Stub)overflowServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.OverflowServiceSoap getOverflowServiceSoap() {
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap;
  }
  
  public java.lang.String helloUser() throws java.rmi.RemoteException{
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap.helloUser();
  }
  
  public org.tempuri.Student[] studentCollection() throws java.rmi.RemoteException{
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap.studentCollection();
  }
  
  public org.tempuri.Course[] courseCollection() throws java.rmi.RemoteException{
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap.courseCollection();
  }
  
  public org.tempuri.Teacher[] teacherCollection() throws java.rmi.RemoteException{
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap.teacherCollection();
  }
  
  public org.tempuri.StudentLoan[] studentLoanCollection() throws java.rmi.RemoteException{
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap.studentLoanCollection();
  }
  
  public org.tempuri.Studies[] studiesCollection() throws java.rmi.RemoteException{
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap.studiesCollection();
  }
  
  public org.tempuri.HasStudied[] hasStudiedCollection() throws java.rmi.RemoteException{
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap.hasStudiedCollection();
  }
  
  public org.tempuri.WorksOn[] worksOnCollection() throws java.rmi.RemoteException{
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap.worksOnCollection();
  }
  
  public org.tempuri.Vehicle[] vehicleCollection() throws java.rmi.RemoteException{
    if (overflowServiceSoap == null)
      _initOverflowServiceSoapProxy();
    return overflowServiceSoap.vehicleCollection();
  }
  
  
}
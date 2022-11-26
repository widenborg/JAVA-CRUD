package org.tempuri;

public class CronusServiceSoapProxy implements org.tempuri.CronusServiceSoap {
  private String _endpoint = null;
  private org.tempuri.CronusServiceSoap cronusServiceSoap = null;
  
  public CronusServiceSoapProxy() {
    _initCronusServiceSoapProxy();
  }
  
  public CronusServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCronusServiceSoapProxy();
  }
  
  private void _initCronusServiceSoapProxy() {
    try {
      cronusServiceSoap = (new org.tempuri.CronusServiceLocator()).getCronusServiceSoap();
      if (cronusServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cronusServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cronusServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cronusServiceSoap != null)
      ((javax.xml.rpc.Stub)cronusServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.CronusServiceSoap getCronusServiceSoap() {
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap;
  }
  
  public org.tempuri.CRONUS_Sverige_AB_Employee[] getEmployees() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployees();
  }
  
  public org.tempuri.CRONUS_Sverige_AB_Employee getEmployee(java.lang.String empID) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployee(empID);
  }
  
  public void insertEmployee(java.lang.String empID, java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    cronusServiceSoap.insertEmployee(empID, firstName, lastName);
  }
  
  public void updateEmployee(java.lang.String empID, java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    cronusServiceSoap.updateEmployee(empID, firstName, lastName);
  }
  
  public void deleteEmployee(java.lang.String empID) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    cronusServiceSoap.deleteEmployee(empID);
  }
  
  
}
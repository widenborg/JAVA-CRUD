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
  
  public org.tempuri.ReadEmployeeAndRelatedTablesResponseReadEmployeeAndRelatedTablesResult readEmployeeAndRelatedTables() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readEmployeeAndRelatedTables();
  }
  
  public org.tempuri.ReadEmployeesAndRelativesResponseReadEmployeesAndRelativesResult readEmployeesAndRelatives() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readEmployeesAndRelatives();
  }
  
  public org.tempuri.ReadAllSickEmployees2004ResponseReadAllSickEmployees2004Result readAllSickEmployees2004() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllSickEmployees2004();
  }
  
  public org.tempuri.ReadHighestAbsenceResponseReadHighestAbsenceResult readHighestAbsence() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readHighestAbsence();
  }
  
  public org.tempuri.ReadAllKeysResponseReadAllKeysResult readAllKeys() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllKeys();
  }
  
  public org.tempuri.ReadAllIndexesResponseReadAllIndexesResult readAllIndexes() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllIndexes();
  }
  
  public org.tempuri.ReadAllConstraintsResponseReadAllConstraintsResult readAllConstraints() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllConstraints();
  }
  
  public org.tempuri.ReadAllTables1ResponseReadAllTables1Result readAllTables1() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllTables1();
  }
  
  public org.tempuri.ReadAllTables2ResponseReadAllTables2Result readAllTables2() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllTables2();
  }
  
  public org.tempuri.ReadEmployeeColumns1ResponseReadEmployeeColumns1Result readEmployeeColumns1() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readEmployeeColumns1();
  }
  
  public org.tempuri.ReadEmployeeColumns2ResponseReadEmployeeColumns2Result readEmployeeColumns2() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readEmployeeColumns2();
  }
  
  public java.lang.String[][] readEmployeeAndRelatedTablesJava() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readEmployeeAndRelatedTablesJava();
  }
  
  public java.lang.String[][] readEmployeesAndRelativesJava() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readEmployeesAndRelativesJava();
  }
  
  public java.lang.String[][] readAllSickEmployees2004Java() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllSickEmployees2004Java();
  }
  
  public java.lang.String[][] readHighestAbsenceJava() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readHighestAbsenceJava();
  }
  
  public java.lang.String[][] readAllKeysJava() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllKeysJava();
  }
  
  public java.lang.String[][] readAllIndexesJava() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllIndexesJava();
  }
  
  public java.lang.String[][] readAllTableConstraintsJava() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllTableConstraintsJava();
  }
  
  public java.lang.String[][] readAllTables1Java() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllTables1Java();
  }
  
  public java.lang.String[][] readAllTables2Java() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readAllTables2Java();
  }
  
  public java.lang.String[][] readEmployeeColumns1Java() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readEmployeeColumns1Java();
  }
  
  public java.lang.String[][] readEmployeeColumns2Java() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.readEmployeeColumns2Java();
  }
  
  
}
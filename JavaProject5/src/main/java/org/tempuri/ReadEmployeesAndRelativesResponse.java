/**
 * ReadEmployeesAndRelativesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadEmployeesAndRelativesResponse  implements java.io.Serializable {
    private org.tempuri.ReadEmployeesAndRelativesResponseReadEmployeesAndRelativesResult readEmployeesAndRelativesResult;

    public ReadEmployeesAndRelativesResponse() {
    }

    public ReadEmployeesAndRelativesResponse(
           org.tempuri.ReadEmployeesAndRelativesResponseReadEmployeesAndRelativesResult readEmployeesAndRelativesResult) {
           this.readEmployeesAndRelativesResult = readEmployeesAndRelativesResult;
    }


    /**
     * Gets the readEmployeesAndRelativesResult value for this ReadEmployeesAndRelativesResponse.
     * 
     * @return readEmployeesAndRelativesResult
     */
    public org.tempuri.ReadEmployeesAndRelativesResponseReadEmployeesAndRelativesResult getReadEmployeesAndRelativesResult() {
        return readEmployeesAndRelativesResult;
    }


    /**
     * Sets the readEmployeesAndRelativesResult value for this ReadEmployeesAndRelativesResponse.
     * 
     * @param readEmployeesAndRelativesResult
     */
    public void setReadEmployeesAndRelativesResult(org.tempuri.ReadEmployeesAndRelativesResponseReadEmployeesAndRelativesResult readEmployeesAndRelativesResult) {
        this.readEmployeesAndRelativesResult = readEmployeesAndRelativesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadEmployeesAndRelativesResponse)) return false;
        ReadEmployeesAndRelativesResponse other = (ReadEmployeesAndRelativesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readEmployeesAndRelativesResult==null && other.getReadEmployeesAndRelativesResult()==null) || 
             (this.readEmployeesAndRelativesResult!=null &&
              this.readEmployeesAndRelativesResult.equals(other.getReadEmployeesAndRelativesResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReadEmployeesAndRelativesResult() != null) {
            _hashCode += getReadEmployeesAndRelativesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadEmployeesAndRelativesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadEmployeesAndRelativesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readEmployeesAndRelativesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadEmployeesAndRelativesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ReadEmployeesAndRelativesResponse>ReadEmployeesAndRelativesResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

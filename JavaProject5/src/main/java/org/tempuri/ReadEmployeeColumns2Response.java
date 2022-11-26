/**
 * ReadEmployeeColumns2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadEmployeeColumns2Response  implements java.io.Serializable {
    private org.tempuri.ReadEmployeeColumns2ResponseReadEmployeeColumns2Result readEmployeeColumns2Result;

    public ReadEmployeeColumns2Response() {
    }

    public ReadEmployeeColumns2Response(
           org.tempuri.ReadEmployeeColumns2ResponseReadEmployeeColumns2Result readEmployeeColumns2Result) {
           this.readEmployeeColumns2Result = readEmployeeColumns2Result;
    }


    /**
     * Gets the readEmployeeColumns2Result value for this ReadEmployeeColumns2Response.
     * 
     * @return readEmployeeColumns2Result
     */
    public org.tempuri.ReadEmployeeColumns2ResponseReadEmployeeColumns2Result getReadEmployeeColumns2Result() {
        return readEmployeeColumns2Result;
    }


    /**
     * Sets the readEmployeeColumns2Result value for this ReadEmployeeColumns2Response.
     * 
     * @param readEmployeeColumns2Result
     */
    public void setReadEmployeeColumns2Result(org.tempuri.ReadEmployeeColumns2ResponseReadEmployeeColumns2Result readEmployeeColumns2Result) {
        this.readEmployeeColumns2Result = readEmployeeColumns2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadEmployeeColumns2Response)) return false;
        ReadEmployeeColumns2Response other = (ReadEmployeeColumns2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readEmployeeColumns2Result==null && other.getReadEmployeeColumns2Result()==null) || 
             (this.readEmployeeColumns2Result!=null &&
              this.readEmployeeColumns2Result.equals(other.getReadEmployeeColumns2Result())));
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
        if (getReadEmployeeColumns2Result() != null) {
            _hashCode += getReadEmployeeColumns2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadEmployeeColumns2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadEmployeeColumns2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readEmployeeColumns2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadEmployeeColumns2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ReadEmployeeColumns2Response>ReadEmployeeColumns2Result"));
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

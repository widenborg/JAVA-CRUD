/**
 * ReadAllSickEmployees2004Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadAllSickEmployees2004Response  implements java.io.Serializable {
    private org.tempuri.ReadAllSickEmployees2004ResponseReadAllSickEmployees2004Result readAllSickEmployees2004Result;

    public ReadAllSickEmployees2004Response() {
    }

    public ReadAllSickEmployees2004Response(
           org.tempuri.ReadAllSickEmployees2004ResponseReadAllSickEmployees2004Result readAllSickEmployees2004Result) {
           this.readAllSickEmployees2004Result = readAllSickEmployees2004Result;
    }


    /**
     * Gets the readAllSickEmployees2004Result value for this ReadAllSickEmployees2004Response.
     * 
     * @return readAllSickEmployees2004Result
     */
    public org.tempuri.ReadAllSickEmployees2004ResponseReadAllSickEmployees2004Result getReadAllSickEmployees2004Result() {
        return readAllSickEmployees2004Result;
    }


    /**
     * Sets the readAllSickEmployees2004Result value for this ReadAllSickEmployees2004Response.
     * 
     * @param readAllSickEmployees2004Result
     */
    public void setReadAllSickEmployees2004Result(org.tempuri.ReadAllSickEmployees2004ResponseReadAllSickEmployees2004Result readAllSickEmployees2004Result) {
        this.readAllSickEmployees2004Result = readAllSickEmployees2004Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadAllSickEmployees2004Response)) return false;
        ReadAllSickEmployees2004Response other = (ReadAllSickEmployees2004Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readAllSickEmployees2004Result==null && other.getReadAllSickEmployees2004Result()==null) || 
             (this.readAllSickEmployees2004Result!=null &&
              this.readAllSickEmployees2004Result.equals(other.getReadAllSickEmployees2004Result())));
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
        if (getReadAllSickEmployees2004Result() != null) {
            _hashCode += getReadAllSickEmployees2004Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadAllSickEmployees2004Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadAllSickEmployees2004Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAllSickEmployees2004Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadAllSickEmployees2004Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ReadAllSickEmployees2004Response>ReadAllSickEmployees2004Result"));
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

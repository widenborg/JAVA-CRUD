/**
 * ReadAllTables2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadAllTables2Response  implements java.io.Serializable {
    private org.tempuri.ReadAllTables2ResponseReadAllTables2Result readAllTables2Result;

    public ReadAllTables2Response() {
    }

    public ReadAllTables2Response(
           org.tempuri.ReadAllTables2ResponseReadAllTables2Result readAllTables2Result) {
           this.readAllTables2Result = readAllTables2Result;
    }


    /**
     * Gets the readAllTables2Result value for this ReadAllTables2Response.
     * 
     * @return readAllTables2Result
     */
    public org.tempuri.ReadAllTables2ResponseReadAllTables2Result getReadAllTables2Result() {
        return readAllTables2Result;
    }


    /**
     * Sets the readAllTables2Result value for this ReadAllTables2Response.
     * 
     * @param readAllTables2Result
     */
    public void setReadAllTables2Result(org.tempuri.ReadAllTables2ResponseReadAllTables2Result readAllTables2Result) {
        this.readAllTables2Result = readAllTables2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadAllTables2Response)) return false;
        ReadAllTables2Response other = (ReadAllTables2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readAllTables2Result==null && other.getReadAllTables2Result()==null) || 
             (this.readAllTables2Result!=null &&
              this.readAllTables2Result.equals(other.getReadAllTables2Result())));
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
        if (getReadAllTables2Result() != null) {
            _hashCode += getReadAllTables2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadAllTables2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadAllTables2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAllTables2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadAllTables2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ReadAllTables2Response>ReadAllTables2Result"));
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

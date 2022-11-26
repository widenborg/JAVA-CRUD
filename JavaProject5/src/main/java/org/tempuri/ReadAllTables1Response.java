/**
 * ReadAllTables1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadAllTables1Response  implements java.io.Serializable {
    private org.tempuri.ReadAllTables1ResponseReadAllTables1Result readAllTables1Result;

    public ReadAllTables1Response() {
    }

    public ReadAllTables1Response(
           org.tempuri.ReadAllTables1ResponseReadAllTables1Result readAllTables1Result) {
           this.readAllTables1Result = readAllTables1Result;
    }


    /**
     * Gets the readAllTables1Result value for this ReadAllTables1Response.
     * 
     * @return readAllTables1Result
     */
    public org.tempuri.ReadAllTables1ResponseReadAllTables1Result getReadAllTables1Result() {
        return readAllTables1Result;
    }


    /**
     * Sets the readAllTables1Result value for this ReadAllTables1Response.
     * 
     * @param readAllTables1Result
     */
    public void setReadAllTables1Result(org.tempuri.ReadAllTables1ResponseReadAllTables1Result readAllTables1Result) {
        this.readAllTables1Result = readAllTables1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadAllTables1Response)) return false;
        ReadAllTables1Response other = (ReadAllTables1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readAllTables1Result==null && other.getReadAllTables1Result()==null) || 
             (this.readAllTables1Result!=null &&
              this.readAllTables1Result.equals(other.getReadAllTables1Result())));
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
        if (getReadAllTables1Result() != null) {
            _hashCode += getReadAllTables1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadAllTables1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadAllTables1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAllTables1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadAllTables1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ReadAllTables1Response>ReadAllTables1Result"));
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

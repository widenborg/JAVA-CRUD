/**
 * ReadAllConstraintsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadAllConstraintsResponse  implements java.io.Serializable {
    private org.tempuri.ReadAllConstraintsResponseReadAllConstraintsResult readAllConstraintsResult;

    public ReadAllConstraintsResponse() {
    }

    public ReadAllConstraintsResponse(
           org.tempuri.ReadAllConstraintsResponseReadAllConstraintsResult readAllConstraintsResult) {
           this.readAllConstraintsResult = readAllConstraintsResult;
    }


    /**
     * Gets the readAllConstraintsResult value for this ReadAllConstraintsResponse.
     * 
     * @return readAllConstraintsResult
     */
    public org.tempuri.ReadAllConstraintsResponseReadAllConstraintsResult getReadAllConstraintsResult() {
        return readAllConstraintsResult;
    }


    /**
     * Sets the readAllConstraintsResult value for this ReadAllConstraintsResponse.
     * 
     * @param readAllConstraintsResult
     */
    public void setReadAllConstraintsResult(org.tempuri.ReadAllConstraintsResponseReadAllConstraintsResult readAllConstraintsResult) {
        this.readAllConstraintsResult = readAllConstraintsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadAllConstraintsResponse)) return false;
        ReadAllConstraintsResponse other = (ReadAllConstraintsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readAllConstraintsResult==null && other.getReadAllConstraintsResult()==null) || 
             (this.readAllConstraintsResult!=null &&
              this.readAllConstraintsResult.equals(other.getReadAllConstraintsResult())));
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
        if (getReadAllConstraintsResult() != null) {
            _hashCode += getReadAllConstraintsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadAllConstraintsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadAllConstraintsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAllConstraintsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadAllConstraintsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ReadAllConstraintsResponse>ReadAllConstraintsResult"));
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

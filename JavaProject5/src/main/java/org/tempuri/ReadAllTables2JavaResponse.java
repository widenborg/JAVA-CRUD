/**
 * ReadAllTables2JavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadAllTables2JavaResponse  implements java.io.Serializable {
    private java.lang.String[][] readAllTables2JavaResult;

    public ReadAllTables2JavaResponse() {
    }

    public ReadAllTables2JavaResponse(
           java.lang.String[][] readAllTables2JavaResult) {
           this.readAllTables2JavaResult = readAllTables2JavaResult;
    }


    /**
     * Gets the readAllTables2JavaResult value for this ReadAllTables2JavaResponse.
     * 
     * @return readAllTables2JavaResult
     */
    public java.lang.String[][] getReadAllTables2JavaResult() {
        return readAllTables2JavaResult;
    }


    /**
     * Sets the readAllTables2JavaResult value for this ReadAllTables2JavaResponse.
     * 
     * @param readAllTables2JavaResult
     */
    public void setReadAllTables2JavaResult(java.lang.String[][] readAllTables2JavaResult) {
        this.readAllTables2JavaResult = readAllTables2JavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadAllTables2JavaResponse)) return false;
        ReadAllTables2JavaResponse other = (ReadAllTables2JavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readAllTables2JavaResult==null && other.getReadAllTables2JavaResult()==null) || 
             (this.readAllTables2JavaResult!=null &&
              java.util.Arrays.equals(this.readAllTables2JavaResult, other.getReadAllTables2JavaResult())));
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
        if (getReadAllTables2JavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadAllTables2JavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadAllTables2JavaResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadAllTables2JavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadAllTables2JavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAllTables2JavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadAllTables2JavaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
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

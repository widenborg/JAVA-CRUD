/**
 * ReadAllSickEmployees2004JavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadAllSickEmployees2004JavaResponse  implements java.io.Serializable {
    private java.lang.String[][] readAllSickEmployees2004JavaResult;

    public ReadAllSickEmployees2004JavaResponse() {
    }

    public ReadAllSickEmployees2004JavaResponse(
           java.lang.String[][] readAllSickEmployees2004JavaResult) {
           this.readAllSickEmployees2004JavaResult = readAllSickEmployees2004JavaResult;
    }


    /**
     * Gets the readAllSickEmployees2004JavaResult value for this ReadAllSickEmployees2004JavaResponse.
     * 
     * @return readAllSickEmployees2004JavaResult
     */
    public java.lang.String[][] getReadAllSickEmployees2004JavaResult() {
        return readAllSickEmployees2004JavaResult;
    }


    /**
     * Sets the readAllSickEmployees2004JavaResult value for this ReadAllSickEmployees2004JavaResponse.
     * 
     * @param readAllSickEmployees2004JavaResult
     */
    public void setReadAllSickEmployees2004JavaResult(java.lang.String[][] readAllSickEmployees2004JavaResult) {
        this.readAllSickEmployees2004JavaResult = readAllSickEmployees2004JavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadAllSickEmployees2004JavaResponse)) return false;
        ReadAllSickEmployees2004JavaResponse other = (ReadAllSickEmployees2004JavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readAllSickEmployees2004JavaResult==null && other.getReadAllSickEmployees2004JavaResult()==null) || 
             (this.readAllSickEmployees2004JavaResult!=null &&
              java.util.Arrays.equals(this.readAllSickEmployees2004JavaResult, other.getReadAllSickEmployees2004JavaResult())));
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
        if (getReadAllSickEmployees2004JavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadAllSickEmployees2004JavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadAllSickEmployees2004JavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(ReadAllSickEmployees2004JavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadAllSickEmployees2004JavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAllSickEmployees2004JavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadAllSickEmployees2004JavaResult"));
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

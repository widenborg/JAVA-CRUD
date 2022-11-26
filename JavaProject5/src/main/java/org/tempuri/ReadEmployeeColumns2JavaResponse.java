/**
 * ReadEmployeeColumns2JavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadEmployeeColumns2JavaResponse  implements java.io.Serializable {
    private java.lang.String[][] readEmployeeColumns2JavaResult;

    public ReadEmployeeColumns2JavaResponse() {
    }

    public ReadEmployeeColumns2JavaResponse(
           java.lang.String[][] readEmployeeColumns2JavaResult) {
           this.readEmployeeColumns2JavaResult = readEmployeeColumns2JavaResult;
    }


    /**
     * Gets the readEmployeeColumns2JavaResult value for this ReadEmployeeColumns2JavaResponse.
     * 
     * @return readEmployeeColumns2JavaResult
     */
    public java.lang.String[][] getReadEmployeeColumns2JavaResult() {
        return readEmployeeColumns2JavaResult;
    }


    /**
     * Sets the readEmployeeColumns2JavaResult value for this ReadEmployeeColumns2JavaResponse.
     * 
     * @param readEmployeeColumns2JavaResult
     */
    public void setReadEmployeeColumns2JavaResult(java.lang.String[][] readEmployeeColumns2JavaResult) {
        this.readEmployeeColumns2JavaResult = readEmployeeColumns2JavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadEmployeeColumns2JavaResponse)) return false;
        ReadEmployeeColumns2JavaResponse other = (ReadEmployeeColumns2JavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readEmployeeColumns2JavaResult==null && other.getReadEmployeeColumns2JavaResult()==null) || 
             (this.readEmployeeColumns2JavaResult!=null &&
              java.util.Arrays.equals(this.readEmployeeColumns2JavaResult, other.getReadEmployeeColumns2JavaResult())));
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
        if (getReadEmployeeColumns2JavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadEmployeeColumns2JavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadEmployeeColumns2JavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(ReadEmployeeColumns2JavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadEmployeeColumns2JavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readEmployeeColumns2JavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadEmployeeColumns2JavaResult"));
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

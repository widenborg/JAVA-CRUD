/**
 * ReadEmployeeColumns1JavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadEmployeeColumns1JavaResponse  implements java.io.Serializable {
    private java.lang.String[][] readEmployeeColumns1JavaResult;

    public ReadEmployeeColumns1JavaResponse() {
    }

    public ReadEmployeeColumns1JavaResponse(
           java.lang.String[][] readEmployeeColumns1JavaResult) {
           this.readEmployeeColumns1JavaResult = readEmployeeColumns1JavaResult;
    }


    /**
     * Gets the readEmployeeColumns1JavaResult value for this ReadEmployeeColumns1JavaResponse.
     * 
     * @return readEmployeeColumns1JavaResult
     */
    public java.lang.String[][] getReadEmployeeColumns1JavaResult() {
        return readEmployeeColumns1JavaResult;
    }


    /**
     * Sets the readEmployeeColumns1JavaResult value for this ReadEmployeeColumns1JavaResponse.
     * 
     * @param readEmployeeColumns1JavaResult
     */
    public void setReadEmployeeColumns1JavaResult(java.lang.String[][] readEmployeeColumns1JavaResult) {
        this.readEmployeeColumns1JavaResult = readEmployeeColumns1JavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadEmployeeColumns1JavaResponse)) return false;
        ReadEmployeeColumns1JavaResponse other = (ReadEmployeeColumns1JavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readEmployeeColumns1JavaResult==null && other.getReadEmployeeColumns1JavaResult()==null) || 
             (this.readEmployeeColumns1JavaResult!=null &&
              java.util.Arrays.equals(this.readEmployeeColumns1JavaResult, other.getReadEmployeeColumns1JavaResult())));
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
        if (getReadEmployeeColumns1JavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadEmployeeColumns1JavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadEmployeeColumns1JavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(ReadEmployeeColumns1JavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadEmployeeColumns1JavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readEmployeeColumns1JavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadEmployeeColumns1JavaResult"));
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

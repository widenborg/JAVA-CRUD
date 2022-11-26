/**
 * ReadAllTableConstraintsJavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadAllTableConstraintsJavaResponse  implements java.io.Serializable {
    private java.lang.String[][] readAllTableConstraintsJavaResult;

    public ReadAllTableConstraintsJavaResponse() {
    }

    public ReadAllTableConstraintsJavaResponse(
           java.lang.String[][] readAllTableConstraintsJavaResult) {
           this.readAllTableConstraintsJavaResult = readAllTableConstraintsJavaResult;
    }


    /**
     * Gets the readAllTableConstraintsJavaResult value for this ReadAllTableConstraintsJavaResponse.
     * 
     * @return readAllTableConstraintsJavaResult
     */
    public java.lang.String[][] getReadAllTableConstraintsJavaResult() {
        return readAllTableConstraintsJavaResult;
    }


    /**
     * Sets the readAllTableConstraintsJavaResult value for this ReadAllTableConstraintsJavaResponse.
     * 
     * @param readAllTableConstraintsJavaResult
     */
    public void setReadAllTableConstraintsJavaResult(java.lang.String[][] readAllTableConstraintsJavaResult) {
        this.readAllTableConstraintsJavaResult = readAllTableConstraintsJavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadAllTableConstraintsJavaResponse)) return false;
        ReadAllTableConstraintsJavaResponse other = (ReadAllTableConstraintsJavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readAllTableConstraintsJavaResult==null && other.getReadAllTableConstraintsJavaResult()==null) || 
             (this.readAllTableConstraintsJavaResult!=null &&
              java.util.Arrays.equals(this.readAllTableConstraintsJavaResult, other.getReadAllTableConstraintsJavaResult())));
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
        if (getReadAllTableConstraintsJavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadAllTableConstraintsJavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadAllTableConstraintsJavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(ReadAllTableConstraintsJavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadAllTableConstraintsJavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAllTableConstraintsJavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadAllTableConstraintsJavaResult"));
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

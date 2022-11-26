/**
 * ReadHighestAbsenceJavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReadHighestAbsenceJavaResponse  implements java.io.Serializable {
    private java.lang.String[][] readHighestAbsenceJavaResult;

    public ReadHighestAbsenceJavaResponse() {
    }

    public ReadHighestAbsenceJavaResponse(
           java.lang.String[][] readHighestAbsenceJavaResult) {
           this.readHighestAbsenceJavaResult = readHighestAbsenceJavaResult;
    }


    /**
     * Gets the readHighestAbsenceJavaResult value for this ReadHighestAbsenceJavaResponse.
     * 
     * @return readHighestAbsenceJavaResult
     */
    public java.lang.String[][] getReadHighestAbsenceJavaResult() {
        return readHighestAbsenceJavaResult;
    }


    /**
     * Sets the readHighestAbsenceJavaResult value for this ReadHighestAbsenceJavaResponse.
     * 
     * @param readHighestAbsenceJavaResult
     */
    public void setReadHighestAbsenceJavaResult(java.lang.String[][] readHighestAbsenceJavaResult) {
        this.readHighestAbsenceJavaResult = readHighestAbsenceJavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadHighestAbsenceJavaResponse)) return false;
        ReadHighestAbsenceJavaResponse other = (ReadHighestAbsenceJavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readHighestAbsenceJavaResult==null && other.getReadHighestAbsenceJavaResult()==null) || 
             (this.readHighestAbsenceJavaResult!=null &&
              java.util.Arrays.equals(this.readHighestAbsenceJavaResult, other.getReadHighestAbsenceJavaResult())));
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
        if (getReadHighestAbsenceJavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadHighestAbsenceJavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadHighestAbsenceJavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(ReadHighestAbsenceJavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReadHighestAbsenceJavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readHighestAbsenceJavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadHighestAbsenceJavaResult"));
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

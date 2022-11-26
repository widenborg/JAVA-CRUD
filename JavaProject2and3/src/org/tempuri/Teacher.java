/**
 * Teacher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Teacher  implements java.io.Serializable {
    private java.lang.String empID;

    private java.lang.String empName;

    public Teacher() {
    }

    public Teacher(
           java.lang.String empID,
           java.lang.String empName) {
           this.empID = empID;
           this.empName = empName;
    }

    @Override
    public String toString() {
    	return ("Teacher name:(" + this.empName + ") Employee ID:(" + this.empID + ")");
    }

    /**
     * Gets the empID value for this Teacher.
     * 
     * @return empID
     */
    public java.lang.String getEmpID() {
        return empID;
    }


    /**
     * Sets the empID value for this Teacher.
     * 
     * @param empID
     */
    public void setEmpID(java.lang.String empID) {
        this.empID = empID;
    }


    /**
     * Gets the empName value for this Teacher.
     * 
     * @return empName
     */
    public java.lang.String getEmpName() {
        return empName;
    }


    /**
     * Sets the empName value for this Teacher.
     * 
     * @param empName
     */
    public void setEmpName(java.lang.String empName) {
        this.empName = empName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Teacher)) return false;
        Teacher other = (Teacher) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.empID==null && other.getEmpID()==null) || 
             (this.empID!=null &&
              this.empID.equals(other.getEmpID()))) &&
            ((this.empName==null && other.getEmpName()==null) || 
             (this.empName!=null &&
              this.empName.equals(other.getEmpName())));
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
        if (getEmpID() != null) {
            _hashCode += getEmpID().hashCode();
        }
        if (getEmpName() != null) {
            _hashCode += getEmpName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Teacher.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Teacher"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EmpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EmpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

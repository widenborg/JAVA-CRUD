/**
 * Student.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Student  implements java.io.Serializable {
    private java.lang.String studentName;

    private java.lang.String studentID;

    public Student() {
    }

    public Student(
           java.lang.String studentName,
           java.lang.String studentID) {
           this.studentName = studentName;
           this.studentID = studentID;
    }
    
    @Override
    public String toString() {
    	return ("Student name:(" + this.studentID + ") Student ID:(" + this.studentName + ")");
    }


    /**
     * Gets the studentName value for this Student.
     * 
     * @return studentName
     */
    public java.lang.String getStudentName() {
        return studentName;
    }


    /**
     * Sets the studentName value for this Student.
     * 
     * @param studentName
     */
    public void setStudentName(java.lang.String studentName) {
        this.studentName = studentName;
    }


    /**
     * Gets the studentID value for this Student.
     * 
     * @return studentID
     */
    public java.lang.String getStudentID() {
        return studentID;
    }


    /**
     * Sets the studentID value for this Student.
     * 
     * @param studentID
     */
    public void setStudentID(java.lang.String studentID) {
        this.studentID = studentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.studentName==null && other.getStudentName()==null) || 
             (this.studentName!=null &&
              this.studentName.equals(other.getStudentName()))) &&
            ((this.studentID==null && other.getStudentID()==null) || 
             (this.studentID!=null &&
              this.studentID.equals(other.getStudentID())));
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
        if (getStudentName() != null) {
            _hashCode += getStudentName().hashCode();
        }
        if (getStudentID() != null) {
            _hashCode += getStudentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Student.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Student"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StudentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StudentID"));
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

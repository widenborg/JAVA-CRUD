/**
 * Studies.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Studies  implements java.io.Serializable {
    private java.lang.String studentID;

    private java.lang.String courseID;

    public Studies() {
    }

    public Studies(
           java.lang.String studentID,
           java.lang.String courseID) {
           this.studentID = studentID;
           this.courseID = courseID;
    }

    @Override
    public String toString() {
    	return ("Student ID:(" + this.studentID + ") Course ID:(" + this.courseID + ")");
    }

    /**
     * Gets the studentID value for this Studies.
     * 
     * @return studentID
     */
    public java.lang.String getStudentID() {
        return studentID;
    }


    /**
     * Sets the studentID value for this Studies.
     * 
     * @param studentID
     */
    public void setStudentID(java.lang.String studentID) {
        this.studentID = studentID;
    }


    /**
     * Gets the courseID value for this Studies.
     * 
     * @return courseID
     */
    public java.lang.String getCourseID() {
        return courseID;
    }


    /**
     * Sets the courseID value for this Studies.
     * 
     * @param courseID
     */
    public void setCourseID(java.lang.String courseID) {
        this.courseID = courseID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Studies)) return false;
        Studies other = (Studies) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.studentID==null && other.getStudentID()==null) || 
             (this.studentID!=null &&
              this.studentID.equals(other.getStudentID()))) &&
            ((this.courseID==null && other.getCourseID()==null) || 
             (this.courseID!=null &&
              this.courseID.equals(other.getCourseID())));
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
        if (getStudentID() != null) {
            _hashCode += getStudentID().hashCode();
        }
        if (getCourseID() != null) {
            _hashCode += getCourseID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Studies.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Studies"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StudentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CourseID"));
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

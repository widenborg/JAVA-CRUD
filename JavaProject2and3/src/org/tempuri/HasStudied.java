/**
 * HasStudied.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class HasStudied  implements java.io.Serializable {
    private java.lang.String studentID;

    private java.lang.String courseID;

    private java.lang.String grade;

    public HasStudied() {
    }

    public HasStudied(
           java.lang.String studentID,
           java.lang.String courseID,
           java.lang.String grade) {
           this.studentID = studentID;
           this.courseID = courseID;
           this.grade = grade;
    }

    @Override
    public String toString() {
    	return ("Student ID:(" + this.studentID + ") Course ID:(" + this.courseID + ") Grade:(" + this.grade + ")");
    }

    /**
     * Gets the studentID value for this HasStudied.
     * 
     * @return studentID
     */
    public java.lang.String getStudentID() {
        return studentID;
    }


    /**
     * Sets the studentID value for this HasStudied.
     * 
     * @param studentID
     */
    public void setStudentID(java.lang.String studentID) {
        this.studentID = studentID;
    }


    /**
     * Gets the courseID value for this HasStudied.
     * 
     * @return courseID
     */
    public java.lang.String getCourseID() {
        return courseID;
    }


    /**
     * Sets the courseID value for this HasStudied.
     * 
     * @param courseID
     */
    public void setCourseID(java.lang.String courseID) {
        this.courseID = courseID;
    }


    /**
     * Gets the grade value for this HasStudied.
     * 
     * @return grade
     */
    public java.lang.String getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this HasStudied.
     * 
     * @param grade
     */
    public void setGrade(java.lang.String grade) {
        this.grade = grade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HasStudied)) return false;
        HasStudied other = (HasStudied) obj;
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
              this.courseID.equals(other.getCourseID()))) &&
            ((this.grade==null && other.getGrade()==null) || 
             (this.grade!=null &&
              this.grade.equals(other.getGrade())));
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
        if (getGrade() != null) {
            _hashCode += getGrade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HasStudied.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "HasStudied"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Grade"));
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

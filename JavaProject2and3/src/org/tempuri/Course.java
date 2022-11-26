/**
 * Course.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Course  implements java.io.Serializable {
    private java.lang.String courseID;

    private java.lang.String courseName;

    private java.lang.String credits;

    public Course() {
    }

    public Course(
           java.lang.String courseID,
           java.lang.String courseName,
           java.lang.String credits) {
           this.courseID = courseID;
           this.courseName = courseName;
           this.credits = credits;
    }

    @Override
    public String toString() {
    	return ("Course name:(" + this.courseName + ") Course ID:( " + this.courseID + ") Credits:(" + this.credits + ")");
    }

    /**
     * Gets the courseID value for this Course.
     * 
     * @return courseID
     */
    public java.lang.String getCourseID() {
        return courseID;
    }


    /**
     * Sets the courseID value for this Course.
     * 
     * @param courseID
     */
    public void setCourseID(java.lang.String courseID) {
        this.courseID = courseID;
    }


    /**
     * Gets the courseName value for this Course.
     * 
     * @return courseName
     */
    public java.lang.String getCourseName() {
        return courseName;
    }


    /**
     * Sets the courseName value for this Course.
     * 
     * @param courseName
     */
    public void setCourseName(java.lang.String courseName) {
        this.courseName = courseName;
    }


    /**
     * Gets the credits value for this Course.
     * 
     * @return credits
     */
    public java.lang.String getCredits() {
        return credits;
    }


    /**
     * Sets the credits value for this Course.
     * 
     * @param credits
     */
    public void setCredits(java.lang.String credits) {
        this.credits = credits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Course)) return false;
        Course other = (Course) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.courseID==null && other.getCourseID()==null) || 
             (this.courseID!=null &&
              this.courseID.equals(other.getCourseID()))) &&
            ((this.courseName==null && other.getCourseName()==null) || 
             (this.courseName!=null &&
              this.courseName.equals(other.getCourseName()))) &&
            ((this.credits==null && other.getCredits()==null) || 
             (this.credits!=null &&
              this.credits.equals(other.getCredits())));
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
        if (getCourseID() != null) {
            _hashCode += getCourseID().hashCode();
        }
        if (getCourseName() != null) {
            _hashCode += getCourseName().hashCode();
        }
        if (getCredits() != null) {
            _hashCode += getCredits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Course.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Course"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CourseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CourseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Credits"));
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

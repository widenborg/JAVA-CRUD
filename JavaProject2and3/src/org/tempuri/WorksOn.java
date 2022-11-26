/**
 * WorksOn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WorksOn  implements java.io.Serializable {
    private java.lang.String empID;

    private java.lang.String courseID;

    public WorksOn() {
    }

    public WorksOn(
           java.lang.String empID,
           java.lang.String courseID) {
           this.empID = empID;
           this.courseID = courseID;
    }

    @Override
    public String toString() {
    	return ("Course ID:(" + this.courseID + ") Emp ID:(" + this.empID + ")");
    }

    /**
     * Gets the empID value for this WorksOn.
     * 
     * @return empID
     */
    public java.lang.String getEmpID() {
        return empID;
    }


    /**
     * Sets the empID value for this WorksOn.
     * 
     * @param empID
     */
    public void setEmpID(java.lang.String empID) {
        this.empID = empID;
    }


    /**
     * Gets the courseID value for this WorksOn.
     * 
     * @return courseID
     */
    public java.lang.String getCourseID() {
        return courseID;
    }


    /**
     * Sets the courseID value for this WorksOn.
     * 
     * @param courseID
     */
    public void setCourseID(java.lang.String courseID) {
        this.courseID = courseID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorksOn)) return false;
        WorksOn other = (WorksOn) obj;
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
        if (getEmpID() != null) {
            _hashCode += getEmpID().hashCode();
        }
        if (getCourseID() != null) {
            _hashCode += getCourseID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorksOn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "WorksOn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EmpID"));
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

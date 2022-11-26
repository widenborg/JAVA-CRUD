/**
 * Vehicle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Vehicle  implements java.io.Serializable {
    private java.lang.String regNbr;

    private java.lang.String brand;

    private java.lang.String empID;

    public Vehicle() {
    }

    public Vehicle(
           java.lang.String regNbr,
           java.lang.String brand,
           java.lang.String empID) {
           this.regNbr = regNbr;
           this.brand = brand;
           this.empID = empID;
    }

    @Override
    public String toString() {
    	return ("Employee ID:(" + this.empID + ") Reg nbr:(" + this.regNbr + ") Car brand:(" + this.brand) + ")";
    }

    /**
     * Gets the regNbr value for this Vehicle.
     * 
     * @return regNbr
     */
    public java.lang.String getRegNbr() {
        return regNbr;
    }


    /**
     * Sets the regNbr value for this Vehicle.
     * 
     * @param regNbr
     */
    public void setRegNbr(java.lang.String regNbr) {
        this.regNbr = regNbr;
    }


    /**
     * Gets the brand value for this Vehicle.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this Vehicle.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the empID value for this Vehicle.
     * 
     * @return empID
     */
    public java.lang.String getEmpID() {
        return empID;
    }


    /**
     * Sets the empID value for this Vehicle.
     * 
     * @param empID
     */
    public void setEmpID(java.lang.String empID) {
        this.empID = empID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regNbr==null && other.getRegNbr()==null) || 
             (this.regNbr!=null &&
              this.regNbr.equals(other.getRegNbr()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.empID==null && other.getEmpID()==null) || 
             (this.empID!=null &&
              this.empID.equals(other.getEmpID())));
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
        if (getRegNbr() != null) {
            _hashCode += getRegNbr().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getEmpID() != null) {
            _hashCode += getEmpID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vehicle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Vehicle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EmpID"));
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

/**
 * StudentLoan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class StudentLoan  implements java.io.Serializable {
    private java.lang.String loanID;

    private java.lang.String amount;

    private java.lang.String studentID;

    public StudentLoan() {
    }

    public StudentLoan(
           java.lang.String loanID,
           java.lang.String amount,
           java.lang.String studentID) {
           this.loanID = loanID;
           this.amount = amount;
           this.studentID = studentID;
    }

    @Override
    public String toString() {
    	return("Student ID:(" + this.studentID + ") Loan ID:(" + this.loanID + ") Amount:(" + this.amount + ")");
    }

    /**
     * Gets the loanID value for this StudentLoan.
     * 
     * @return loanID
     */
    public java.lang.String getLoanID() {
        return loanID;
    }


    /**
     * Sets the loanID value for this StudentLoan.
     * 
     * @param loanID
     */
    public void setLoanID(java.lang.String loanID) {
        this.loanID = loanID;
    }


    /**
     * Gets the amount value for this StudentLoan.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this StudentLoan.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the studentID value for this StudentLoan.
     * 
     * @return studentID
     */
    public java.lang.String getStudentID() {
        return studentID;
    }


    /**
     * Sets the studentID value for this StudentLoan.
     * 
     * @param studentID
     */
    public void setStudentID(java.lang.String studentID) {
        this.studentID = studentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudentLoan)) return false;
        StudentLoan other = (StudentLoan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loanID==null && other.getLoanID()==null) || 
             (this.loanID!=null &&
              this.loanID.equals(other.getLoanID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
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
        if (getLoanID() != null) {
            _hashCode += getLoanID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getStudentID() != null) {
            _hashCode += getStudentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudentLoan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "StudentLoan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LoanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Amount"));
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

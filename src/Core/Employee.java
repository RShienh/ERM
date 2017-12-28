/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import erm.ERM;

/**
 *
 * @author rajbir
 */
public class Employee extends ERM {

    private String eFirstName, eLastName, eGender, eAddress, eEmail, eDesignation, eDepartment, ePayType, eAttendance, ePerformace;     //declaration of string type variables
    
    private long eDOB, ePay, ePhone;   //declaration of long type variables
    private int eID;        //declaration of ID as int

    public Employee(int eID, String eFirstName, String eLastName, long eDOB, String eGender, long ePhone,
            String eAddress, String eEmail, String eDepartment, String eDesignation, //generating constructor with all variables
            String ePayType, long ePay, String eAttendance, String ePerformace) {
        this.eID = eID;
        this.eFirstName = eFirstName;
        this.eLastName = eLastName;
        this.eDOB = eDOB;
        this.eGender = eGender;
        this.ePhone = ePhone;
        this.eAddress = eAddress;
        this.eEmail = eEmail;                                       //setting them equal to local variables
        this.eDepartment = eDepartment;
        this.eDesignation = eDesignation;
        this.ePayType = ePayType;
        this.ePay = ePay;
        this.eAttendance = eAttendance;
        this.ePerformace = ePerformace;
    }

    //setting up getters for each variable type
    public String geteFirstName() {
        return eFirstName;
    }

    public String geteLastName() {
        return eLastName;
    }

    public String geteGender() {
        return eGender;
    }

    public String geteAddress() {
        return eAddress;
    }

    public String geteEmail() {
        return eEmail;
    }

    public String geteDesignation() {
        return eDesignation;
    }

    public String geteDepartment() {
        return eDepartment;
    }

    public String getePayType() {
        return ePayType;
    }

    public int geteID() {
        return eID;
    }

    public long geteDOB() {
        return eDOB;
    }

    public long getePhone() {
        return ePhone;
    }

    public long getePay() {
        return ePay;
    }

    public String geteAttendance() {
        return eAttendance;
    }

    public String getePerformace() {
        return ePerformace;
    }

    //setting up setters
    public void seteFirstName(String eFirstName) {
        this.eFirstName = eFirstName;
    }

    public void seteLastName(String eLastName) {
        this.eLastName = eLastName;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    public void seteDesignation(String eDesignation) {
        this.eDesignation = eDesignation;
    }

    public void seteDepartment(String eDepartment) {
        this.eDepartment = eDepartment;
    }

    public void setePayType(String ePayType) {
        this.ePayType = ePayType;
    }

    public void seteAttendance(String eAttendance) {
        this.eAttendance = eAttendance;
    }

    public void setePerformace(String ePerformace) {
        this.ePerformace = ePerformace;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public void seteDOB(long eDOB) {
        this.eDOB = eDOB;
    }

    public void setePay(long ePay) {
        this.ePay = ePay;
    }

    public void setePhone(long ePhone) {
        this.ePhone = ePhone;
    }

    public void returnList() {                                                                                                                      //returns the list data
        System.out.println("    " + this.eID + "    " + this.eFirstName + "   " + this.eLastName + "   "
                + this.eDOB + "   " + this.eGender + "   " + this.ePhone + "   " + this.eAddress + "    "
                + this.eEmail + "  " + this.eDepartment + "   " + this.eDesignation + "   "
                + this.ePayType + "   " + this.ePay + "    " + this.eAttendance + "   " + this.ePerformace);
    }

}

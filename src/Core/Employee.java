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

    private double eID, eDOB, ePay, ePhone;             //declaration of double type variables

    public Employee(double eID, String eFirstName, String eLastName, double eDOB, String eGender, double ePhone,
            String eAddress, String eEmail, String eDepartment, String eDesignation, //generating constructor with all variables
            String ePayType, double ePay, String eAttendance, String ePerformace) {
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

    public double geteID() {
        return eID;
    }

    public double geteDOB() {
        return eDOB;
    }

    public double getePhone() {
        return ePhone;
    }

    public double getePay() {
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

    public void seteID(double eID) {
        this.eID = eID;
    }

    public void seteDOB(double eDOB) {
        this.eDOB = eDOB;
    }

    public void setePay(double ePay) {
        this.ePay = ePay;
    }

    public void setePhone(double ePhone) {
        this.ePhone = ePhone;
    }

    public void returnList() {
        System.out.println("    " + eID + "    " + eFirstName + "   " + eLastName + "   "
                + eDOB + "   " + eGender + "   " + ePhone + "   " + eAddress + "    "
                + eEmail + "  " + eDepartment + "   " + eDesignation + "   " + ePayType + "   " + ePay + "    " + eAttendance + "   " + ePerformace);
    }

}

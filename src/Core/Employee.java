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
            String eAddress, String eEmail, String eDepartment, String eDesignation,                            //generating constructor with all variables
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

    public void returnList() {
        System.out.println("    " + eID + "    " + eFirstName + "   " + eLastName + "   "
                + eDOB + "   " + eGender + "   " + ePhone + "   " + eAddress + "    "
                + eEmail + "  " + eDepartment + "   " + eDesignation + "   " + ePayType + "   " + ePay+"    "+eAttendance+"   "+ ePerformace);
    }
}

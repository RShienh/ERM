/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Core.Employee;

/**
 *
 * @author rajbi
 */
public class SalaryData extends Employee{

    public SalaryData(int eID, String eFirstName, String eLastName, long eDOB, String eGender, long ePhone, String eAddress, String eEmail, String eDepartment, String eDesignation, String ePayType, long ePay, String eAttendance, String ePerformace) {
        super(eID, eFirstName, eLastName, eDOB, eGender, ePhone, eAddress, eEmail, eDepartment, eDesignation, ePayType, ePay, eAttendance, ePerformace);
    }

}

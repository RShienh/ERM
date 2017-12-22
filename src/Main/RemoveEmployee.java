/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Core.Employee;
import java.util.Scanner;

/**
 *
 * @author rajbi
 */
public class RemoveEmployee extends Employee {

    public RemoveEmployee(double eID, String eFirstName, String eLastName, double eDOB, String eGender, double ePhone, String eAddress, String eEmail, String eDepartment, String eDesignation, String ePayType, double ePay, String eAttendance, String ePerformace) {
        super(eID, eFirstName, eLastName, eDOB, eGender, ePhone, eAddress, eEmail, eDepartment, eDesignation, ePayType, ePay, eAttendance, ePerformace);
    }

    public static void remove(Employee[] e) {
        Scanner data = new Scanner(System.in);
        System.out.println("***The list***");
        MenuManager.listAll(e);
        System.out.print("Enter the ID number of the employee you want to remove: ");
        int rID = data.nextInt();
        MenuManager.line();
//        for (int i = rID; i < e.length - 1; i++) {
//            e[i] = e[i + 1];
//        }
        System.out.println("Searching...");
        for (int i = 0; i < e.length; i++) {          
        }
        System.out.println("***The new list***");
        MenuManager.listAll(e);
    }
}

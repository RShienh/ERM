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
 * @author rajbir
 */
public class EmployeeDatabase extends Employee {                                                        //inherits methods of employee

    public static void add(int input, Employee[] e) {                                                           //add method to add data to array e
        double dob, p, py;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < input; i++) {                                                                                   //asks for data for number of entries added at the starting of program
            int iid = i + 1;
            System.out.print("Enter the First name:- ");
            String fn = s.next();
            System.out.print("Enter the Last name:- ");
            String ln = s.next();
            do {
                System.out.print("Enter the date of birth(ddmmyyyy):- ");                               //check to see if data added is double value or not
                while (!s.hasNextDouble()) {
                    System.err.print("Enter a number -> ");
                    System.out.print("Enter the date of birth(ddmmyyyy):- ");
                    s.next();
                }
                dob = s.nextDouble();
            } while (dob <= 0);
            System.out.print("Enter the gender m/f/x:- ");
            String g = s.next();
            do {
                System.out.print("Enter the Phone Number:- ");                                                  //check to see if data added is double value or not
                while (!s.hasNextDouble()) {
                    System.err.print("Enter a number ->");
                    System.out.print("Enter the Phone Number:- ");
                    s.next();
                }
                p = s.nextDouble();
            } while (p <= 0);
            System.out.print("Enter the mailing address:- ");
            String ma = s.next();
            System.out.print("Enter the email address:- ");
            String em = s.next();
            System.out.print("Enter the department:- ");
            String dep = s.next();
            System.out.print("Enter the designation:- ");
            String dsg = s.next();
            System.out.print("Enter the pay type (h/s):- ");
            String pt = s.next();
            do {
                System.out.print("Enter the Pay:- ");
                while (!s.hasNextDouble()) {                                                                                    //check to see if data added is double value or not
                    System.err.print("Enter a number ->");
                    System.out.print("Enter the Pay:- ");
                    s.next();
                }
                py = s.nextDouble();
            } while (py <= 0);
            System.out.print("Enter the attendance, if not available leave it as 'N/A':- ");
            String at = s.next();
            System.out.print("Enter the Performance data, if not available leave it as 'N/A':- ");
            String pd = s.next();

            e[i] = new Employee(iid, fn, ln, dob, g, p, ma, em, dep, dsg, pt, py, at, pd);                              //adds all that data to constructor of employeee

            MenuManager.line();
        }

    }

    public static void remove(int n, Employee[] e) {                                                                        //mehtod to remove data from array
        Scanner data = new Scanner(System.in);
        System.out.println("***The list***");
        listAll(n, e);
        System.out.print("Enter the ID number of the employee you want to remove: ");
        int rID = data.nextInt();
        MenuManager.line();
        System.out.println("Searching...");
        for (int i = 0; i < e.length; i++) {
            Employee a = e[i];
            int nw = a.geteID();
            if (nw != rID) {
            } else {
                a.seteID(0);
            }
        }
        System.out.println("***The new list***");
        listAll(n, e);
    }

    public static void listAll(int in, Employee[] a) {
        if (a != null) {
            for (int i = 0; i < in; i++) {
                Employee e = a[i];
                System.out.println("    " + e.geteID() + "    " + e.geteFirstName() + "    " + e.geteLastName() + "   " + e.geteDOB()
                        + "    " + e.geteGender() + "    " + e.getePhone() + "   " + e.geteAddress() + "    " + e.geteEmail()
                        + "    " + e.geteDepartment() + "    " + e.geteDesignation() + "    " + e.getePayType()
                        + "    " + e.getePay() + "   " + e.geteAttendance() + "   " + e.getePerformace());
            }
            MenuManager.line();
        } else {
            System.err.println("***No data in the database***");
        }
    }

    public EmployeeDatabase(int eID, String eFirstName, String eLastName, double eDOB, String eGender, double ePhone, String eAddress, String eEmail, String eDepartment, String eDesignation, String ePayType, double ePay, String eAttendance, String ePerformace) {
        super(eID, eFirstName, eLastName, eDOB, eGender, ePhone, eAddress, eEmail, eDepartment, eDesignation, ePayType, ePay, eAttendance, ePerformace);
    }

}

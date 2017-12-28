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
        long dob, p, py;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < input; i++) {                                                                                   //asks for data for number of entries added at the starting of program
            System.out.print("Enter the First name:- ");
            String fn = s.next();
            System.out.print("Enter the Last name:- ");
            String ln = s.next();
            do {
                System.out.print("Enter the date of birth(ddmmyyyy):- ");                               //check to see if data added is long value or not
                while (!s.hasNextLong()) {
                    System.err.print("Enter a number -> ");
                    System.out.print("Enter the date of birth(ddmmyyyy):- ");
                    s.next();
                }
                dob = s.nextLong();
            } while (dob <= 0);
            System.out.print("Enter the gender m/f/x:- ");
            String g = s.next();
            do {
                System.out.print("Enter the Phone Number:- ");                                                  //check to see if data added is long value or not
                while (!s.hasNextLong()) {
                    System.err.print("Enter a number ->");
                    System.out.print("Enter the Phone Number:- ");
                    s.next();
                }
                p = s.nextLong();
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
                while (!s.hasNextLong()) {                                                                                    //check to see if data added is long value or not
                    System.err.print("Enter a number ->");
                    System.out.print("Enter the Pay:- ");
                    s.next();
                }
                py = s.nextLong();
            } while (py <= 0);
            System.out.print("Enter the attendance, if not available leave it as 'N/A':- ");
            String at = s.next();
            System.out.print("Enter the Performance data, if not available leave it as 'N/A':- ");
            String pd = s.next();

            e[i] = new Employee(i, fn, ln, dob, g, p, ma, em, dep, dsg, pt, py, at, pd);                              //adds all that data to constructor of employeee

            MenuManager.line();
        }

    }

    public static void remove(int n, Employee[] e) {                                                                        //mehtod to remove data from array
        Scanner data = new Scanner(System.in);
        System.out.println("***The list***");
        listAll(n, e);
        System.out.print("Enter the Phone number of the employee you want to remove: ");
        long rPhone = data.nextLong();
        MenuManager.line();
        System.out.println("Searching...");
        for (int i = 0; i < n; i++) {                                                                                //gets total length of the array
            Employee a = e[i];
            long nw = a.getePhone();
            if (nw != rPhone) {
                //System.err.println("Phone number not found!");
            } else {                                                                                                    //set's value as 0
                a.setePhone(0);
            }
        }
        System.out.println("***The new list***");
        listAll(n, e);
    }

    public static void search(int n, Employee[] e) {
    }

    public static void update(int n, Employee[] e) {
    }

    public static void listAll(int in, Employee[] a) {                                                  //to list all
        if (a != null) {
            for (int i = 0; i < in; i++) {                                                                          //for loop to list all arrays 
                Employee e = a[i];
                if (e.getePhone()!= 0) {
                    System.out.println("    " + e.geteFirstName() + "    " + e.geteLastName() + "   " + e.geteDOB()
                            + "    " + e.geteGender() + "    " + e.getePhone() + "   " + e.geteAddress() + "    " + e.geteEmail()
                            + "    " + e.geteDepartment() + "    " + e.geteDesignation() + "    " + e.getePayType()
                            + "    " + e.getePay() + "   " + e.geteAttendance() + "   " + e.getePerformace());
                }
            }
            MenuManager.line();
        } else {
            System.err.println("***No data in the database***");
        }
    }

    public EmployeeDatabase(int eID, String eFirstName, String eLastName, long eDOB, String eGender, long ePhone, String eAddress, String eEmail, String eDepartment, String eDesignation, String ePayType, long ePay, String eAttendance, String ePerformace) {
        super(eID, eFirstName, eLastName, eDOB, eGender, ePhone, eAddress, eEmail, eDepartment, eDesignation, ePayType, ePay, eAttendance, ePerformace);
    }

}

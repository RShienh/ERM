/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Core.Employee;
import erm.ERM;
import java.util.Scanner;

/**
 *
 * @author rajbir
 */
public class MenuManager extends ERM {

    public static void Menus(int n, Employee[] e) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        do {
            if (n != 0) {
                line();
                System.out.println("**Select from list of menus**\n");
                System.out.println("1. Add an Employee's Data");
                System.out.println("2. List all employees:- ");
                System.out.println("3. Remove an Employee's Data");
                System.out.println("4. Update an Employee's Data");
                System.out.println("5. Search for an Employee's Data");
                System.out.println("6. Check Attendance of an Employee");
                System.out.println("7. Employee's Performance Data");
                System.out.println("8. Manage Employee's Salary");
                System.out.println("9. Exit");
                System.out.print("Enter your choice: ");
                switch (input.nextInt()) {
                    case 1:
                        line();
                        EmployeeData.add(n,e);
                        break;
                    case 2:
                        line();
                        listAll(e);
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        System.out.println("");
                        System.out.println(" You chose to exit !");
                        exit = true;
                        break;
                    default:
                        System.err.println("Invalid Choice, please select from the following menus");
                }
            }
            System.out.println("");
        } while (!exit);
    }

    public static String line() {
        for (int i = 0; i < 202; i++) {
            System.out.print("'");
        }
        System.out.println("");
        return null;
    }
    
      public static void listAll(Employee[] a) {
        for (int i = 0; i < a.length; i++) {
            Employee e = a[i];
            System.out.println("    " + e.geteID() + "    " + e.geteFirstName() + "    " + e.geteLastName() + "   " + e.geteDOB()
                    + "    " + e.geteGender() + "    " + e.getePhone() + "   " + e.geteAddress() + "    " + e.geteEmail()
                    + "    " + e.geteDepartment() + "    " + e.geteDesignation() + "    " + e.getePayType()
                    + "    " + e.getePay() + "   " + e.geteAttendance() + "   " + e.getePerformace());
        }
    }
}

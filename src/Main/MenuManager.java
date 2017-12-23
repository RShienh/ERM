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
        do {                                                    //runs the loop of menus
            if (n != 0) {                                     //second validation to check if entries are not 0
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
                        EmployeeDatabase.add(n, e);                                     //calls add method in employee database
                        break;
                    case 2:
                        EmployeeDatabase.listAll(n, e);                                 //calls list all method in employee database
                        break;
                    case 3:
                        line();
                        EmployeeDatabase.remove(n, e);                            //calls remove method of the employeedatabase method
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
                        exit = true;                                                                //set's exit to true and ends loop
                        break;
                    default:
                        System.err.println("Invalid Choice, please select from the following menus");
                }
            }
            System.out.println("");
        } while (!exit);
    }

    public static String line() {
        for (int i = 0; i < 200; i++) {                                             //just a method to draw lines
            System.out.print(":");
        }
        System.out.println("");
        return null;
    }
}

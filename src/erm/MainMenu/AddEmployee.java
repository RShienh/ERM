/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erm.MainMenu;

import Core.Employee;
import erm.ERM;
import java.util.Scanner;

/**
 *
 * @author rajbir
 */
public class AddEmployee extends ERM {

    public static void add(int input) {
        Scanner s = new Scanner(System.in);
        Employee[] emp = new Employee[input + 1];
        for (int i = 0; i < input; i++) {
            double iid = input + 1;
            System.out.print("Enter the First name:- ");
            String fn = s.next();
            System.out.print("Enter the Last name:- ");
            String ln = s.next();
            System.out.print("Enter the date of birth(ddmmyyyy):- ");
            double dob = s.nextDouble();
            System.out.print("Enter the gender m/f/x:- ");
            String g = s.next();
            System.out.print("Enter the phone number:- ");
            double p = s.nextDouble();
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
            System.out.print("Enter the pay: ");
            double py = s.nextDouble();
            System.out.print("Enter the attendance, if not available leave it as 'N/A':- ");
            String at = s.next();
            System.out.print("Enter the Performance data, if not available leave it as 'N/A':- ");
            String pd = s.next();
            emp[i]= new Employee(iid, fn, ln, dob,g,p,ma,em,dep,dsg,pt,py,at,pd);
            System.out.println("");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erm;

import Core.Employee;
import Main.MenuManager;
import java.util.Scanner;

/**
 *
 * @author rajbi
 */
public class ERM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int entries;                                                                                                        //initializing of varaible
        System.out.println("+++Welcome to ERM system+++");
        MenuManager.line();
        Scanner input = new Scanner(System.in);                                                         //scanner to get input data from user
        do {                                                                                                                    //do loop to continue to check of data entered is positive number or not
            System.out.print("Enter the number of entries :- ");
            while (!input.hasNextInt()) {
                System.err.print("Enter a number ->");
                System.out.print("Enter the number of entries :- ");
                input.next();
            }
            entries = input.nextInt();
        } while (entries <= 0);
        Employee[] e = new Employee[entries];                                                               //new object of employee array
        MenuManager.Menus(entries, e);                                                                          //initializing of menu method

    }

}

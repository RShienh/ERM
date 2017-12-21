/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erm.MainMenu;

/**
 *
 * @author rajbi
 */
public class ListEmployees extends AddEmployee {

    public static void list(int in) {
        System.out.println("***Here is the list of all employees***");
        MenuManager.line();
        
        for (int i = 0; i < in; i++) {
            
        }
    }
}

package Modules.makeup.utils;

import javax.swing.JOptionPane;

import Utils.regular_exp;
import Utils.validates;

public class data_functions {

    public static String ask_id(String message, String title){

		boolean result = false;

		String id = "";

        do{

            id = validates.cad(message, title);

            result = regular_exp.id(id);

            if (result == false){

				JOptionPane.showMessageDialog(null, "Has introducido un identificador no válido", "Error", JOptionPane.ERROR_MESSAGE);
            
            }

        }while(result == false);

        return id;

    }

    public static String ask_customer_name(String message, String title){
		
        boolean result = false;
		
        String customer_name = "";

        do{

            customer_name = validates.cad(message, title);

            result = regular_exp.customer_name(customer_name);

            if (result == false){

				JOptionPane.showMessageDialog(null, "Has introducido un nombre no válido", "Error", JOptionPane.ERROR_MESSAGE);
            
            }

        }while(result == false);

        return customer_name;

    }
    
}

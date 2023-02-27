package Modules.functions;

import javax.swing.JOptionPane;
import Modules.makeup.classes.Singleton;
import Modules.makeup.classes.Basic;


public class functions_makeup {

    public static Basic create_basic() {

		String id = Singleton.id;

        String customer_name = JOptionPane.showInputDialog(null," Nombre del cliente: ");
        
        String number_string = JOptionPane.showInputDialog(null, " ¿Qué precio va a tener el servicio? ");
        int price = Integer.parseInt(number_string);

        String place = JOptionPane.showInputDialog(null," ¿En qué lugar se realizará? ");

        String time = JOptionPane.showInputDialog(null," ¿A qué hora se realizará? ");

        String type = JOptionPane.showInputDialog(null," ¿De que tipo quieres que sea? ");

        return new Basic(id, customer_name, price, place, time, type); 

    }

        
    public static Basic create_basic_id() {

        String id = JOptionPane.showInputDialog(null, "Identificador", "¿Que identificafor desea poner?", JOptionPane.QUESTION_MESSAGE);

        Singleton.id = id;

        return new Basic(id);
    }
    
}

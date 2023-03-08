package Modules.functions.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import Modules.makeup.classes.Singleton;
import Modules.orders.customer_name_order;
import Modules.orders.id_order;
import Modules.orders.place_order;
import menus.buttons;

public class order_functions{

    public static void order_basic(){

        String[] menu = {"Identificador", "Nombre del cliente", "Lugar", "Salir"};
        Boolean key = false;

        if (Singleton.basic.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existen servicios para poder ordenarlos", "Error",
					JOptionPane.ERROR_MESSAGE);

        }else if (Singleton.basic.size() == 1){

            JOptionPane.showMessageDialog(null, "Solo existe un servicio y por lo tanto no se puede ordenar", "Error",
					JOptionPane.ERROR_MESSAGE);

        }else{

            do{

                int option_menu = buttons.menu_buttons(menu, "Seleccione el orden que usted desee", "Elija la opción deseada");
                
                key = true;
                
                switch(option_menu){

                    case 0:
                       
                        Collections.sort(Singleton.basic, new id_order());

                        break;

                    case 1:

                        Collections.sort(Singleton.basic, new customer_name_order());
                   
                        break;

                    case 2:

                        Collections.sort(Singleton.basic, new place_order());

                        break;

                    case 3:

                    key = false;

                }

            }while(key != false);
            
        }

    }




    
}
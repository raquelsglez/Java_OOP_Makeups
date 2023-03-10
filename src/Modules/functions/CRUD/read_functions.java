package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.makeup.classes.Basic;
import Modules.makeup.classes.Singleton;
import menus.buttons;
import Modules.functions.functions_makeup;
import Modules.makeup.utils.find_functions;

public class read_functions {

    public static void read_basic(Basic bc) {

        int option_menu = 0;
        int option_atributo = 0;
        String[] menu = {"All", "One to one", "Volver"};
        String[] atributos = {"id", "customer_name", "price", "place", "time", "type", "Volver"};
        String atributo = "";
        Boolean key_atributos = false;
        Boolean key = false;

        if (Singleton.basic.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existe este servicio para poder ver sus características", "Error",
					JOptionPane.ERROR_MESSAGE);

        }else{

            do{

                 option_menu = buttons.menu_buttons(menu, "¿Cuántos servicios quiere ver?", "Elija la opción deseada");

                switch(option_menu){

                    case 0:

					      for (int i = 0; i < Singleton.basic.size(); i++) {

						      String cad = (Singleton.basic.get(i).toString());

						      JOptionPane.showMessageDialog(null, cad);

                            }

                           key = true;
                           break;

                    case 1:
                        
                        int location = 0;

                        bc = functions_makeup.basic_id("¿Cuál es el identificador del servicio que desea ver?");

					    location = find_functions.find_basic(bc);

                        if (location != -1) {

                            bc = Singleton.basic.get(location);


                            key_atributos = true;

                            do{

                               option_atributo = buttons.menu_buttons(atributos, "¿Que característica quiere leer?","Elija la opción deseada");

                                switch (option_atributo){

                                    case 0:

                                         atributo = ("id: " + bc.getId());

                                         break;

                                    case 1:

                                         atributo = ("customer_name: " + bc.getCustomer_name());

                                         break;
                            
                                    case 2:

                                         atributo = ("price: " + bc.getPrice());

                                        break;

                                    case 3:

                                         atributo = ("place: " + bc.getPlace());

                                         break;

                                    case 4:

                                         atributo = ("time: " + bc.getTime());

                                         break;
                            
                                    case 5:

                                         atributo = ("type " + bc.getType());

                                         break;

                                     case 6:

                                         atributo = ("Volver");

                                         key_atributos = false;

                                         break;
                                }

                                JOptionPane.showMessageDialog(null, atributo);

                            }while(key_atributos != false);

                        }else{

                            JOptionPane.showMessageDialog(null, "No existe este código en ningún servicio", "Error",
								JOptionPane.ERROR_MESSAGE);
                        }

                        key = true;

                      
                    case 2:

                         key = false;
                         break;
                    
                }

            }while(key != false);

        }
    
    }

}
package menus;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modules.functions.CRUD.create_functions;
import Modules.functions.CRUD.delete_functions;
import Modules.functions.CRUD.read_functions;
import Modules.functions.CRUD.update_functions;
import Modules.makeup.classes.Basic;
import Modules.makeup.classes.Singleton;

public class menu_makeup {

    public static void main(String[] args) {

        String[] menu_makeup = { "Básico", "Temático", "Eventos", "Salir"};
        String[] menu_crud = { "Create", "Read", "Update", "Delete", "Volver", "Salir"};
        boolean key_menu_makeup = false;
        boolean key_menu_crud = false;

        Singleton.basic = new ArrayList <Basic> ();

        int option_menu_makeup = 0;
        int option_menu_crud = 0;
        Basic bc = null;

        do {

          option_menu_makeup = buttons.menu_buttons(menu_makeup, "Seleccione una opción", "Maquillajes");

          key_menu_makeup = true;
              
            switch(option_menu_makeup) {

                case 0:
                
                  do {
                    
                      option_menu_crud = buttons.menu_buttons(menu_crud, "Seleccione una acción", "Básico");

                      switch(option_menu_crud) {

                        case 0:

                             key_menu_crud = true;

                              create_functions.create_basic(bc);

                             break;

                        case 1:
                        
                             read_functions.read_basic(bc);

                             key_menu_crud = true;

                             break;

                        case 2:

                             update_functions.update_basic(bc);

                             key_menu_crud = true;

                             break;

                        case 3:

                            delete_functions.delete_basic(bc);

                             key_menu_crud = true;

                             break;

                        case 4:

                             JOptionPane.showMessageDialog(null, "Volver Básico");

                             key_menu_crud = false;

                             break;

                        case 5:

                            JOptionPane.showMessageDialog(null, "Salir Básico");

                            key_menu_crud = false;
                            key_menu_makeup = false;

                            break;

                      }

                  }while(key_menu_crud != false);

                  break;

                case 1:

                  do {
                    
                    option_menu_crud = buttons.menu_buttons(menu_crud, "Seleccione una acción", "Temático");

                    switch(option_menu_crud) {

                      case 0:

                           JOptionPane.showMessageDialog(null, "Create Temático");

                           key_menu_crud = true;

                           break;

                      case 1:

                           JOptionPane.showMessageDialog(null, "Read Temático");

                           key_menu_crud = true;

                           break;

                      case 2:

                           JOptionPane.showMessageDialog(null, "Update Temático");

                           key_menu_crud = true;

                           break;

                      case 3:

                           JOptionPane.showMessageDialog(null, "Delete Temático");

                           key_menu_crud = true;

                           break;

                      case 4:

                           JOptionPane.showMessageDialog(null, "Volver Temático");

                           key_menu_crud = false;

                           break;

                      case 5:

                          JOptionPane.showMessageDialog(null, "Salir Temático");

                          key_menu_crud = false;
                          key_menu_makeup = false;

                          break;

                    }

                }while(key_menu_crud != false);

                  break;

                case 2:


                  do {
                    
                    option_menu_crud = buttons.menu_buttons(menu_crud, "Seleccione una acción", "Eventos");

                    switch(option_menu_crud) {

                      case 0:

                           JOptionPane.showMessageDialog(null, "Create Eventos");

                           key_menu_crud = true;

                           break;

                      case 1:

                           JOptionPane.showMessageDialog(null, "Read Eventos");

                           key_menu_crud = true;

                           break;

                      case 2:

                           JOptionPane.showMessageDialog(null, "Update Eventos");

                           key_menu_crud = true;

                           break;

                      case 3:

                           JOptionPane.showMessageDialog(null, "Delete Eventos");

                           key_menu_crud = true;

                           break;

                      case 4:

                           JOptionPane.showMessageDialog(null, "Volver Eventos");

                           key_menu_crud = false;

                           break;

                      case 5:

                          JOptionPane.showMessageDialog(null, "Salir Eventos");

                          key_menu_crud = false;
                          key_menu_makeup = false;

                          break;

                    }

                }while(key_menu_crud != false);

                  break;

                case 3:

                  JOptionPane.showMessageDialog(null, "Salir");

                  key_menu_makeup = false;

                  break;

            }

        }while(key_menu_makeup != false);

    }

}
package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.functions.functions_makeup;
import Modules.makeup.classes.Basic;
import Modules.makeup.classes.Singleton;
import Modules.makeup.utils.find_functions;

public class delete_functions {

    public static void delete_basic(Basic bc){


        if (Singleton.basic.isEmpty()){
			JOptionPane.showMessageDialog(null, "No existe este servicio para poder eliminarlo", "Error",
					JOptionPane.ERROR_MESSAGE);

        }else{

            bc = functions_makeup.delete_basic_id();

            int location = find_functions.find_basic(bc);

            if(location!=-1) {

                Singleton.basic.remove(location); //remove para borrar//

                JOptionPane.showMessageDialog(null, "Has eliminado el servicio", "Eliminado", JOptionPane.INFORMATION_MESSAGE);

            }else{

                JOptionPane.showMessageDialog(null, "No existe ningún servicio con este identificador", "Error",
                 JOptionPane.ERROR_MESSAGE);

            }
  
        }
 
    }

    
}

package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.functions.functions_makeup;
import Modules.makeup.classes.Basic;
import Modules.makeup.classes.Singleton;
import Modules.makeup.utils.find_functions;

public class update_functions {

    public static void update_basic(Basic bc){

        if (Singleton.basic.isEmpty()) {
            
			JOptionPane.showMessageDialog(null, "No existe este servicio para poder cambiar sus características",
					"Error", JOptionPane.ERROR_MESSAGE);

		}else{

            int location = 0;

            bc = functions_makeup.update_basic_id();
            
            location = find_functions.find_basic(bc);

            if(location != -1){

                bc = Singleton.basic.get(location);

                functions_makeup.update(bc);

                Singleton.basic.set(location, bc);

            }else{

                JOptionPane.showMessageDialog(null,
						"No existe ningún servicio con este identificador para poder cambiar sus características", "Error",
						JOptionPane.ERROR_MESSAGE);

            }

        }

    }
    
}

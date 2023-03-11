package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.functions.functions_makeup;
import Modules.makeup.classes.Basic;
import Modules.makeup.classes.Singleton;
import Modules.makeup.classes.Thematic;
import Modules.makeup.utils.find_functions;

public class update_functions {

    public static void update_basic(Basic bc){

        if (Singleton.basic.isEmpty()) {
            
			JOptionPane.showMessageDialog(null, "No existe este servicio para poder cambiar sus características",
					"Error", JOptionPane.ERROR_MESSAGE);

		}else{

            int location = 0;

            bc = functions_makeup.basic_id("¿Cuál es el identificador del servicio que desea cambiar?");
            
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

    public static void update_thematic(Thematic th){

        if (Singleton.thematic.isEmpty()) {
            
			JOptionPane.showMessageDialog(null, "No existe este servicio para poder cambiar sus características",
					"Error", JOptionPane.ERROR_MESSAGE);

		}else{

            int location = 0;

            th = functions_makeup.thematic_id("¿Cuál es el identificador del servicio que desea cambiar?");
            
            location = find_functions.find_thematic(th);

            if(location != -1){

                th = Singleton.thematic.get(location);

                functions_makeup.update(th);

                Singleton.thematic.set(location, th);

            }else{

                JOptionPane.showMessageDialog(null,
						"No existe ningún servicio con este identificador para poder cambiar sus características", "Error",
						JOptionPane.ERROR_MESSAGE);

            }

        }

    }
    
}

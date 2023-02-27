package Modules.functions.CRUD;

import javax.swing.JOptionPane;
import Modules.functions.functions_makeup;
import Modules.makeup.classes.Basic;
import Modules.makeup.classes.Singleton;
import Modules.makeup.utils.find_functions;


//Hola
public class create_functions {

    public static void create_basic(Basic bc){

        int location = 0;

        bc = functions_makeup.create_basic_id();

        location = find_functions.find_basic(bc);

        if (location != -1){

			JOptionPane.showMessageDialog(null, "Ya existe este código en otro producto", "Error", JOptionPane.ERROR_MESSAGE);

		}else{

			bc = functions_makeup.create_basic();
			Singleton.basic.add(bc);
		}

    }
    
}

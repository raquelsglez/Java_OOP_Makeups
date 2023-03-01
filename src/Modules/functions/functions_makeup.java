package Modules.functions;

import Modules.makeup.classes.Singleton;
import Modules.makeup.utils.data_functions;
import Utils.validates;
import Modules.makeup.classes.Basic;


public class functions_makeup {

    public static Basic create_basic() {

		String id = Singleton.id;

        String customer_name = data_functions.ask_customer_name("¿A qué nombre quiere que esté el servicio?", "Nombre");
        
        int price = validates.number("¿Qué precio va a tener el servicio?", "Precio");

        String place = validates.cad("¿En qué lugar se realizará?", "Lugar");

        String time = validates.cad("¿A qué hora se realizará?", "Hora");

        String[] option_type = {"Día", "Noche", "Casual"};

        String type = validates.combo(option_type, "¿Qué tipo de maquillaje quieres?", "Tipo" );

        return new Basic(id, customer_name, price, place, time, type); 

    }

        
    public static Basic create_basic_id() {

        String id = data_functions.ask_id("¿Qué identificador desea para este servicio?", "Identificador");

        Singleton.id = id;

        return new Basic(id);
    }

    public static Basic read_basic_id() {

        String id = data_functions.ask_id("¿Cuál es el identificador del servicio que desea ver?", "Identificador");

        Singleton.id = id;

        return new Basic(id);
    }
    
    public static Basic delete_basic_id() {

        String id = data_functions.ask_id("¿Cuál es el identificador del servicio que desea eliminar?", "Identificador");

        Singleton.id = id;

        return new Basic(id);
    }
    
}

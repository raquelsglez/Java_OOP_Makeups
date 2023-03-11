package Modules.functions;

import Modules.makeup.classes.Singleton;
import Modules.makeup.classes.Thematic;
import Modules.makeup.utils.data_functions;
import Utils.validates;
import menus.buttons;
import Modules.makeup.classes.Basic;
import Modules.makeup.classes.Makeup;


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


    public static Thematic create_thematic() {

		String id = Singleton.id;

        String customer_name = data_functions.ask_customer_name("¿A qué nombre quiere que esté el servicio?", "Nombre");
        
        int price = validates.number("¿Qué precio va a tener el servicio?", "Precio");

        String place = validates.cad("¿En qué lugar se realizará?", "Lugar");

        String time = validates.cad("¿A qué hora se realizará?", "Hora");

        String[] option_thematic_type = {"Animación", "Terror", "Fantasia"};

        String thematic_type = validates.combo(option_thematic_type, "¿Qué tipo de maquillaje quieres?", "Tipo" );

        return new Thematic(id, customer_name, price, place, time, thematic_type); 

    }

    public static Basic basic_id(String message){
        
        String id = data_functions.ask_id(message, "Identificador");

        Singleton.id = id;

        return new Basic(id);
    }


    public static Thematic thematic_id(String message){
        
        String id = data_functions.ask_id(message, "Identificador");

        Singleton.id = id;

        return new Thematic(id);
    }


    public static void update(Makeup mak) {

		if (mak instanceof Basic) {

			String[] menu = { "Nombre del cliente", "Precio", "Lugar", "Hora", "Tipo", "Salir" };
			
            int option_menu = 0;
			
            boolean key = false;

            do{

                option_menu = buttons.menu_buttons(menu, "Seleccione la operación deseada", "Elegir opción");

                key = true;

                switch(option_menu){

                    case 0: //Nombre//

                         String customer_name = data_functions.ask_customer_name("¿A qué nombre quiere que esté el servicio?", "Nombre");

                         mak.setCustomer_name(customer_name);

                         break;

                    case 1: //Precio//

                         int price = validates.number("¿Qué precio va a tener el servicio?", "Precio");

                         mak.setPrice(price);

                         break;

                    case 2:

                         String place = validates.cad("¿En qué lugar se realizará?", "Lugar");

                         mak.setPlace(place);

                         break;

                    case 3:

                         String time = validates.cad("¿A qué hora se realizará?", "Hora");

                         mak.setTime(time);

                         break;

                    case 4:
                    
                         String[] option_type = {"Día", "Noche", "Casual"};

                         String type = validates.combo(option_type, "¿Qué tipo de maquillaje quieres?", "Tipo" ); 

                         ((Basic) mak).setType(type);

                         break;

                    case 5:

                         key = false;

                         break;

                }

            }while(key != false);

        }

        if (mak instanceof Thematic) {

			String[] menu = { "Nombre del cliente", "Precio", "Lugar", "Hora", "Temática", "Salir" };
			
            int option_menu = 0;
			
            boolean key = false;
            
            do{

                option_menu = buttons.menu_buttons(menu, "Seleccione la operación deseada", "Elegir opción");

                key = true;

                switch(option_menu){

                    case 0: //Nombre//

                         String customer_name = data_functions.ask_customer_name("¿A qué nombre quiere que esté el servicio?", "Nombre");

                         mak.setCustomer_name(customer_name);

                         break;

                    case 1: //Precio//

                         int price = validates.number("¿Qué precio va a tener el servicio?", "Precio");

                         mak.setPrice(price);

                         break;

                    case 2:

                         String place = validates.cad("¿En qué lugar se realizará?", "Lugar");

                         mak.setPlace(place);

                         break;

                    case 3:

                         String time = validates.cad("¿A qué hora se realizará?", "Hora");

                         mak.setTime(time);

                         break;

                    case 4:
                    
                         String[] option_type = {"Animación", "Terror", "Fantasía"};

                         String thematic_type = validates.combo(option_type, "¿Qué tipo de maquillaje quieres?", "Tipo" ); 

                         ((Thematic) mak).setThematic_type(thematic_type);

                         break;

                    case 5:

                         key = false;

                         break;

                }

            }while(key != false);

        }


    }
    
}

package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_exp{

    private static final String Expresion_customer_name = "^[a-zA-Z\\s]*$";

    private static final String Expresion_id = "[A-Z]+[0-9]{5}$";

   
    public static boolean customer_name(String customer_name) {

		Pattern pattern = Pattern.compile(Expresion_customer_name); //Compilar es ejecutar el código internamente//

		Matcher matcher = pattern.matcher(customer_name);

		return matcher.matches();
	}

    public static boolean id(String id) {

		Pattern pattern = Pattern.compile(Expresion_id); //Compilar es ejecutar el código internamente//

		Matcher matcher = pattern.matcher(id);

		return matcher.matches();
	}
    
}

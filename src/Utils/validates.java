package Utils;

import javax.swing.JOptionPane;

public class validates{

    public static String cad(String message, String title){

		String cad = "";

		boolean  cad_valida = false;

        do{

            cad_valida = true;

            try{

                cad = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);

                if (cad.equals("")) {
					JOptionPane.showMessageDialog(null, "Error de introducción de datos", "Error",
							JOptionPane.ERROR_MESSAGE);

					cad_valida = false;
				}

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "Error en la introdución de datos", "Error",
						JOptionPane.ERROR_MESSAGE);

				cad_valida = false;

            }

        }while(cad_valida == false);

        return cad;
    
    }

    public static int number(String message, String title) {

        int number = 0;
        String cad = "";
        boolean valido = false;

        do{

            try{

                cad = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);

                if(cad == null){

                    JOptionPane.showMessageDialog(null,"Saliendo de la aplicación", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
                    
                    System.exit(0);
                    
                    valido = false;

                }else{

                    number = Integer.parseInt(cad);

                    valido = true;

                }

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "No has introducido un número", "Error", JOptionPane.ERROR_MESSAGE);
				valido = false;

            }

        }while(valido == false);

		return number;

    }

    public static String combo(String[] options, String message, String title){

        //Object cuando es una selección de textos// Los objetos se declaran a null//

        Object selection = null;

        do{

            selection = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options, null);

        }while(selection == null);

        return (String) selection;

    }
}

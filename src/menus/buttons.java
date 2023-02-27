package menus;

import javax.swing.JOptionPane;

public class buttons {

    public static int menu_buttons(String[] options, String message, String title) {

        int option = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        return option;
            
    }
    
}

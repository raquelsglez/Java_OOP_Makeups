package Modules.orders;

import java.util.Comparator;

import Modules.makeup.classes.Makeup;

public class place_order  implements Comparator<Makeup>{

    public int compare (Makeup m1, Makeup m2){

        if (m1.getPlace().compareTo(m2.getPlace()) > 0){

            return 1;

        }else if (m1.getPlace().compareTo(m2.getPlace()) < 0){

            return -1;

        }else{

            return 0;

        }
        
    }
    
}

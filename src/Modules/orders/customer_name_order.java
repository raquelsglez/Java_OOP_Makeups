package Modules.orders;

import java.util.Comparator;

import Modules.makeup.classes.Makeup;

public class customer_name_order implements Comparator<Makeup>{

    public int compare (Makeup m1, Makeup m2){

        if (m1.getCustomer_name().compareTo(m2.getCustomer_name()) > 0){

            return 1;

        }else if (m1.getCustomer_name().compareTo(m2.getCustomer_name()) < 0){

            return -1;

        }else{

            return 0;

        }
    }
    
}

package Modules.makeup.utils;

import Modules.makeup.classes.Singleton;
import Modules.makeup.classes.Basic;
import Modules.makeup.classes.Thematic;

public class find_functions {
    
    public static int find_basic(Basic basic) { 

        for (int i = 0; i<Singleton.basic.size(); i++){

            if((Singleton.basic.get(i)).equals(basic))
                
                return i;
        }
        return -1;
    }


    public static int find_thematic(Thematic thematic) { 

        for (int i = 0; i<Singleton.thematic.size(); i++){

            if((Singleton.thematic.get(i)).equals(thematic))
                
                return i;
        }
        return -1;
    }
}

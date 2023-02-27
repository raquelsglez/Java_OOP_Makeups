package Modules.makeup.classes;

public abstract class Makeup implements Comparable<Makeup> {
    
    
    ////ATRIBUTOS////

     private String id;
     private String customer_name;
     private int price;
     private String place;
     private String time;


    ////CONSTRUCTOR////

     public Makeup(String id, String customer_name, int price, String place, String time) {
        
        this.id = id;
        this.customer_name = customer_name;
        this.price = price;
        this.place = place;
        this.time = time;

    }

    ////CONSTRUCTOR VACIO////

    public Makeup() {

    }

    ////CONSTRUCTOR CLAVE PRIMARIA////

    public Makeup(String id) {

        this.id = id;

    }

    ////GETTERS////

    public String getId() {

        return id;
    }

    public String getCustomer_name() {

        return customer_name;
    }

    public int getPrice() {

        return price;
    }

    public String getPlace() {

        return place;
    }

    public String getTime() {

        return time;
    }

    ////SETTERS////
    
    public void setId(String id) {

        this.id = id;
    }

    public void setCustomer_name(String customer_name) {

        this.customer_name = customer_name;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public void setPlace(String place) {

        this.place = place;
    }

    public void setTime(String time) {

        this.time = time;
    }

   
    public boolean equals(Object makeup) {

        return getId().equals(((Makeup) makeup).getId());
    }

    public int compareTo(Makeup makeup) { //para ordenarlos//

        if(this.getId().compareTo(makeup.getId()) > 0) {

            return 1;
        }

        if(this.getId().compareTo(makeup.getId()) < 0) {

            return -1;
        }
        return 0;
        
    }

    public abstract String toString();


}

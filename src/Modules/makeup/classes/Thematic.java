package Modules.makeup.classes;

public class Thematic extends Makeup {

    private String thematic_type;
    

    ////CONSTRUCTOR////

    public Thematic(String id, String customer_name, int price, String place, String time, String thematic_type) {

        super(id, customer_name, price, place, time);

        this.thematic_type = thematic_type;

    }

    public Thematic() {

        super();
    }

    ////CONSTRUCTOR CLAVE PRIMARIA////

    public Thematic(String id) {

        super(id);
    }

    ////GETTERS SETTERS////

    public String getThematic_type() {

        return thematic_type;
    }

    public void setThematic_type(String thematic_type) {

        this.thematic_type = thematic_type;
    }

     ////TO STRING////

     public String toString() {

        return " Maquillaje temático: " + "\n" +
               " Identificador: " + getId() + "\n" +
               " Nombre del cliente: " + getCustomer_name() + "\n" +
               " Precio: " + getPrice() + " \n" +
               " Lugar: " + getPlace() + "\n" + 
               " Hora: " + getTime() + "\n" +
               " Temática: " + getThematic_type();

    }
    
}

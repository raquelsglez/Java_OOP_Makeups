package Modules.makeup.classes;

public class Basic extends Makeup {

    private String type;

    ////CONSTRUCTOR////

    public Basic(String id, String customer_name, int price, String place, String time, String type) {

        super(id, customer_name, price, place, time);

        this.type = type;

    }

    public Basic() {

        super();
    }

    ////CONSTRUCTOR CLAVE PRIMARIA////

    public Basic(String id) {

        super(id);
    }

    ////GETTERS SETTERS////

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    ////TO STRING////

    public String toString() {

        return " Maquillaje básico: " + "\n" +
               " Identificador: " + getId() + "\n" +
               " Nombre del cliente: " + getCustomer_name() + "\n" +
               " Precio: " + getPrice() + " \n" +
               " Lugar: " + getPlace() + "\n" + 
               " Hora: " + getTime() + "\n" +
               " Tipo: " + getType();

    }


}

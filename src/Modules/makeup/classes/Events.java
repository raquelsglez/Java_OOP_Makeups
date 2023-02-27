package Modules.makeup.classes;

public class Events extends Makeup {

    private int number_people;

    ////CONSTRUCTOR////

    public Events(String id, String customer_name, int price, String place, String time, int number_people) {

        super(id, customer_name, price, place, time);

        this.number_people = number_people;

    }
    
    public Events() { ////CONSTRUCTOR VACÍO////

        super();
    }

    ////CONSTRUCTOR CLAVE PRIMARIA////

    public Events(String id) {

        super(id);
    }

    ////GETTERS SETTERS////

    public int getNumber_people() {

        return number_people;
    }

    public void setNumber_people(int number_people) {

        this.number_people = number_people;
    }

    ////TO STRING////

    public String toString() {

        return " Maquillaje para eventos: " + "\n" +
               " Identificador: " + getId() + "\n" +
               " Nombre del cliente: " + getCustomer_name() + "\n" +
               " Precio: " + getPrice() + " \n" +
               " Lugar: " + getPlace() + "\n" + 
               " Hora: " + getTime() + "\n" +
               " Número de personas: " + getNumber_people();
    }
 
}

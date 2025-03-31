package models;

import java.util.Scanner;

abstract class Device {
    protected String serial;
    protected String brand;
    protected double price;
    protected String studentName;
    protected boolean available;

    public Device(String serial, String brand, double price, String studentName, boolean available) {
        this.serial = serial;
        this.brand = brand;
        this.price = price;
        this.studentName = studentName;
        this.available = available;
    }

    //Metodos que se implementaran en hijos de la clase, son abstractos ya que no tienen implemenacion
    public abstract void edit(Scanner sc);
    public abstract void display();

    //Metodos generales de los dispositivos
}

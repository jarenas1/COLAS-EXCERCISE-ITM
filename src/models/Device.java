package models;

import java.util.Scanner;

public abstract class Device {
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
    public void loan(String studentName) {
        if (available) {
            this.studentName = studentName;
            available = false;
            System.out.println("prestamo exitoso");
        } else {
            System.out.println("dispositivo no disponible");
        }
    }

    public void returnDevice() {
        this.studentName = "";
        available = true;
        System.out.println("dispositivo devuelto");
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

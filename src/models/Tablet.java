package models;

import java.util.Scanner;

public class Tablet extends Device{
    private String size;

    public Tablet(String serial, String size, String brand, double price, String studentName, boolean available) {
        super(serial, brand, price, studentName, available);
        this.size = size;
    }

    @Override
    public void edit(Scanner sc) {
        System.out.print("nuevo serial:");
        serial = sc.nextLine();
        System.out.print("nuevo tamaño:");
        size = sc.nextLine();
        System.out.print("nueva marca:");
        brand = sc.nextLine();
        System.out.print("nuevo precio:");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("nuevo nombre estudiante: ");
        studentName = sc.nextLine();
        System.out.print("esta disponible (true/false): ");
        available = Boolean.parseBoolean(sc.nextLine());

    }

    @Override
    public void display() {
        System.out.println("tipo tablet");
        System.out.println("serial" + serial);
        System.out.println("tamaño" + size);
        System.out.println("marca " + brand);
        System.out.println("precio " + price);
        System.out.println("nombre estudiante " + studentName);
        System.out.println("disponible" + available);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

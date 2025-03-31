package models;

import java.util.Scanner;

public class Computer extends Device{
    private String memoryRam;
    private String disk;
    private String studentId;

    public Computer(String serial, String brand, String memoryRam, String disk, double price, String studentName, String studentId, boolean available) {
        super(serial, brand, price, studentName, available);
        this.memoryRam = memoryRam;
        this.disk = disk;
        this.studentId = studentId;
    }

    @Override
    public void edit(Scanner sc) {
            System.out.print("nuevo serial:");
            serial = sc.nextLine();
            System.out.print("nueva marca:");
            brand = sc.nextLine();
            System.out.print("nueva memoria ram:");
            memoryRam = sc.nextLine();
            System.out.print("nuevo disco duro: ");
            disk = sc.nextLine();
            System.out.print("nuevo precio: ");
            price = Double.parseDouble(sc.nextLine());
            System.out.print("nuevo nombre estudiante:");
            studentName = sc.nextLine();
            System.out.print("nuevo carnet: ");
            studentId = sc.nextLine();
            System.out.print("esta disponible (true/false): ");
            available = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.println("tipo pc");
        System.out.println("serial " + serial);
        System.out.println("marca " + brand);
        System.out.println("memoria ram " + memoryRam);
        System.out.println("disco duro " + disk);
        System.out.println("precio " + price);
        System.out.println("nombre estudiante " + studentName);
        System.out.println("carnet " + studentId);
        System.out.println("disponible " + available);
    }
}

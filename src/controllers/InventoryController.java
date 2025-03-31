package controllers;

import models.Computer;
import models.Tablet;
import services.InventoryService;

import java.util.Scanner;

public class InventoryController {
    private InventoryService service = new InventoryService();

    public InventoryController() {
    }

    public void start(Scanner sc) {
        int option;
        do {
            System.out.println("\n--- menu de inventario ---");
            System.out.println("1 agregar dispositivo");
            System.out.println("2 prestar dispositivo");
            System.out.println("3 devolver dispositivo");
            System.out.println("4 mostrar inventario");
            System.out.println("5 editar dispositivo");
            System.out.println("6 salir");
            System.out.print("seleccione una opcion: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    System.out.println("seleccione el tipo de dispositivo");
                    System.out.println("1 pc");
                    System.out.println("2 tablet");
                    int type = Integer.parseInt(sc.nextLine());
                    if (type == 1) {
                        System.out.print("serial: ");
                        String serial = sc.nextLine();
                        System.out.print("marca: ");
                        String brand = sc.nextLine();
                        System.out.print("memoria ram: ");
                        String memoryRam = sc.nextLine();
                        System.out.print("disco duro: ");
                        String disk = sc.nextLine();
                        System.out.print("precio: ");
                        double price = Double.parseDouble(sc.nextLine());
                        System.out.print("nombre estudiante: ");
                        String studentName = sc.nextLine();
                        System.out.print("carnet: ");
                        String studentId = sc.nextLine();
                        Computer pc = new Computer(serial, brand, memoryRam, disk, price, studentName, studentId, true);
                        service.addDevice(pc);
                    } else if (type == 2) {
                        System.out.print("serial: ");
                        String serial = sc.nextLine();
                        System.out.print("tamaño: ");
                        String size = sc.nextLine();
                        System.out.print("marca: ");
                        String brand = sc.nextLine();
                        System.out.print("precio: ");
                        double price = Double.parseDouble(sc.nextLine());
                        System.out.print("nombre estudiante: ");
                        String studentName = sc.nextLine();
                        Tablet tablet = new Tablet(serial, size, brand, price, studentName, true);
                        service.addDevice(tablet);
                    } else {
                        System.out.println("tipo no valido");
                    }
                    break;

                case 2:
                    System.out.print("ingrese serial: ");
                    String serialLoan = sc.nextLine();
                    System.out.print("ingrese nombre estudiante: ");
                    String studentLoan = sc.nextLine();
                    service.loanDevice(serialLoan, studentLoan);
                    break;

                case 3:
                    System.out.print("ingrese serial: ");
                    String serialReturn = sc.nextLine();
                    service.returnDevice(serialReturn);
                    break;

                case 4:
                    service.displayInventory();
                    break;

                case 5:
                    System.out.print("ingrese serial: ");
                    String serialEdit = sc.nextLine();
                    service.editDevice(serialEdit, sc);
                    break;

                case 6:
                    System.out.println("saliendo");
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (option != 6);
    }
}

package services;

import models.Device;
import models.Inventory;

import java.util.Scanner;

public class InventoryService {
    private Inventory inventory = new Inventory(); //Inyectamos la dependencia de inventory

    public void addDevice(Device device) {
        inventory.addDevice(device);
    }

    public void loanDevice(String serial, String studentName) {
        boolean found = false;
        for (Device device : inventory.getDevices()) {
            if (device.getSerial().equals(serial)) {
                device.loan(studentName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("dispositivo no encontrado");
        }
    }

    public void returnDevice(String serial) {
        boolean found = false;
        for (Device device : inventory.getDevices()) {
            if (device.getSerial().equals(serial)) {
                device.returnDevice();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("dispositivo no encontrado");
        }
    }

    public void editDevice(String serial, Scanner sc) {
        boolean found = false;
        for (Device device : inventory.getDevices()) {
            if (device.getSerial().equals(serial)) {
                device.edit(sc);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("dispositivo no encontrado");
        }
    }

    public void displayInventory() {
        if (inventory.getDevices().isEmpty()) {
            System.out.println("inventario vacio");
        } else {
            for (Device device : inventory.getDevices()) {
                device.display();
                System.out.println("------------ -------------------");
            }
        }
    }
}

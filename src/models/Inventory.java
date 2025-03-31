package models;

import java.util.LinkedList;
import java.util.Queue;

public class Inventory {
    private Queue<Device> queue;

    public Inventory() {
        queue = new LinkedList<>();
    }

    public void addDevice(Device device) {
        queue.add(device);
        System.out.println("dispositivo agregado al inventario");
    }

    public Queue<Device> getDevices() {
        return queue;
    }
}

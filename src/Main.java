import controllers.InventoryController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        InventoryController controller = new InventoryController();

        controller.start(sc);


    }
}
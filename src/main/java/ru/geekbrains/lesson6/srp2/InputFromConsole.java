package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class InputFromConsole {

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void inputFromConsole(){
        order.setClientName(prompt("Client name: "));/* = prompt("Client name: ");*/
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }

    public InputFromConsole(Order order) {
        this.order = order;
    }

    private Order order;

}

package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать приложение в рамках принципа SRP
     * @param args
     */
    public static void main(String[] args) {

        Order order2 = new Order();
        InputFromConsole inputFromConsole = new InputFromConsole(order2);
        inputFromConsole.inputFromConsole();
        SaveToJson saveToJson = new SaveToJson(order2);
        saveToJson.saveToJson();
    }

}

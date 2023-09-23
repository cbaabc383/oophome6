package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson {

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order2.getClientName() + "\",\n");
            writer.write("\"product\":\""+order2.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order2.getQnt()+",\n");
            writer.write("\"price\":"+order2.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public SaveToJson(Order order2) {
        this.order2 = order2;
    }

    private Order order2;
}

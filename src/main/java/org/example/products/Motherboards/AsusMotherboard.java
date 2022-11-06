package org.example.products.Motherboards;

public class AsusMotherboard implements Motherboard {

    String name = "Asus ROG Strix B450-F Gaming";

    @Override
    public void assemble() {
        System.out.println("Assembling Asus motherboard");
    }

    @Override
    public String toString() {
        return name;
    }

}

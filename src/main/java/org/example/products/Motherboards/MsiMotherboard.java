package org.example.products.Motherboards;

public class MsiMotherboard implements Motherboard {

    String name = "MSI MPG Z390 Gaming Plus";

    @Override
    public void assemble() {
        System.out.println("Assembling MSI motherboard");
    }

    @Override
    public String toString() {
        return name;
    }

}

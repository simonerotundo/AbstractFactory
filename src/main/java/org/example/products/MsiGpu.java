package org.example.products;

public class MsiGpu implements Gpu {

    String name = "MSI GeForce RTX 3080 Ti GAMING X TRIO";

    @Override
    public void assemble() {
        System.out.println("Assembling Msi Gpu");
    }

    @Override
    public String toString() {
        return name;
    }

}

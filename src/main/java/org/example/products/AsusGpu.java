package org.example.products;

public class AsusGpu implements Gpu {

    String name = "Asus GeForce RTX 3080 Ti GAMING X TRIO";

    @Override
    public void assemble() {
        System.out.println("Assembling Asus Gpu");
    }

    @Override
    public String toString() {
        return name;
    }
}

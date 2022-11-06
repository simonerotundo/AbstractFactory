package org.example.products;

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling Asus Gpu");
    }

    @Override
    public String toString() {
        return "Asus Gpu";
    }
}

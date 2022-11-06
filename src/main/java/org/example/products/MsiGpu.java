package org.example.products;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi Gpu");
    }

    @Override
    public String toString() {
        return "Msi Gpu";
    }
}

package org.example.products;

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling Asus monitor");
    }

    @Override
    public String toString() {
        return "Asus Monitor";
    }
}

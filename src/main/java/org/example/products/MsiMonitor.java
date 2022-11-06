package org.example.products;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi monitor");
    }

    @Override
    public String toString() {
        return "Msi Monitor";
    }
}

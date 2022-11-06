package org.example.products.Monitors;

public class AsusMonitor implements Monitor {

    String name = "Asus VG248QE";

    @Override
    public void assemble() {
        System.out.println("Assembling Asus monitor");
    }

    @Override
    public String toString() {
        return name;
    }
}

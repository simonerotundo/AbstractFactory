package org.example.products.Monitors;

public class MsiMonitor implements Monitor {

    String name = "MSI Optix MAG272CQR";

    @Override
    public void assemble() {
        System.out.println("Assembling Msi monitor");
    }

    @Override
    public String toString() {
        return name;
    }

}

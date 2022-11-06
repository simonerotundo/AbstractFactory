package org.example.computer;

import org.example.products.GPUs.Gpu;
import org.example.products.Monitors.Monitor;
import org.example.products.Motherboards.Motherboard;

public class Computer {
    private final Gpu gpu;
    private final Monitor monitor;

    private final Motherboard motherboard;

    public Computer(Gpu gpu, Monitor monitor, Motherboard motherboard) {
        this.gpu = gpu;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void printBuild() {
        System.out.println("Your build is: " + gpu.toString() + ", " + monitor.toString() + " and " + motherboard.toString());
    }

}

package org.example.computer;

import org.example.products.Gpu;
import org.example.products.Monitor;

public class Computer {
    private Gpu gpu;
    private Monitor monitor;


    public Computer(Gpu gpu, Monitor monitor) {
        this.gpu = gpu;
        this.monitor = monitor;
    }

    public void printBuild() {
        System.out.println("Your build is: " + gpu.toString() + " and " + monitor.toString());
    }

}

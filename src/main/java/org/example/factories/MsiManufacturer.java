package org.example.factories;

import org.example.products.GPUs.Gpu;
import org.example.products.Monitors.Monitor;
import org.example.products.GPUs.MsiGpu;
import org.example.products.Monitors.MsiMonitor;
import org.example.products.Motherboards.Motherboard;
import org.example.products.Motherboards.MsiMotherboard;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

    @Override
    public Motherboard createMotherboard() {
        return new MsiMotherboard();
    }

}

package org.example.factories;

import org.example.products.GPUs.AsusGpu;
import org.example.products.Monitors.AsusMonitor;
import org.example.products.GPUs.Gpu;
import org.example.products.Monitors.Monitor;
import org.example.products.Motherboards.AsusMotherboard;
import org.example.products.Motherboards.Motherboard;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public Motherboard createMotherboard() {
        return new AsusMotherboard();
    }

}

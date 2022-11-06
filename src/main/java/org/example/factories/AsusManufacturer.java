package org.example.factories;

import org.example.products.AsusGpu;
import org.example.products.AsusMonitor;
import org.example.products.Gpu;
import org.example.products.Monitor;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}

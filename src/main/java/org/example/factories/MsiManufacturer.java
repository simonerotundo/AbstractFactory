package org.example.factories;

import org.example.products.Gpu;
import org.example.products.Monitor;
import org.example.products.MsiGpu;
import org.example.products.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

}

package org.example.factories;

import org.example.products.GPUs.Gpu;
import org.example.products.Monitors.Monitor;
import org.example.products.Motherboards.Motherboard;

/* AsusManufacturer e MsiManufacturer ereditano i metodi di Company */
public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

    public abstract Motherboard createMotherboard();
}

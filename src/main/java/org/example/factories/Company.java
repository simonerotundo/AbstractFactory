package org.example.factories;

import org.example.products.Gpu;
import org.example.products.Monitor;

/* AsusManufacturer e MsiManufacturer ereditano i metodi di Company */
public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}

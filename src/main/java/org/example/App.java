package org.example;

import org.example.computer.Computer;
import org.example.factories.AsusManufacturer;
import org.example.factories.Company;
import org.example.factories.MsiManufacturer;
import org.example.products.Product;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main( String[] args ) {

        Company msi  = new MsiManufacturer();
        Company asus = new AsusManufacturer();


        asus.createGpu().assemble();
        Computer myBuild = new Computer(asus.createGpu(), msi.createMonitor());
        myBuild.printBuild();

    }
}

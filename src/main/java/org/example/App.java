package org.example;

import org.example.computer.Computer;
import org.example.factories.AsusManufacturer;
import org.example.factories.Company;
import org.example.factories.MsiManufacturer;

/**
 * Hello world!
 */
public class App {
    public static void main( String[] args ) {

        Company msi  = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        Computer myBuild = new Computer(asus.createGpu(), msi.createMonitor(), asus.createMotherboard());
        myBuild.printBuild();

    }
}

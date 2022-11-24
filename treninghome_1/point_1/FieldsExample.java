package org.example.treninghome_1.point_1;

public class FieldsExample {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", 1976);

// И вдруг поняли что ошиблись с годом //*

        mercedes.year = 2000;
        // mercedes.producer = "Brabus";

        System.out.println(mercedes);

        Car bmw = new Car();
        System.out.println("bmw=" + bmw);

        Car fiat = new Car("Fiat");
        fiat.year = 2022;
        System.out.println("fiat=" + fiat);

        Integer serialNumber = Car.serialNumber;

        mercedes.setSerialNumber(666);

        System.out.println("fiat.getSerialNumber() = " + fiat.getSerialNumber());



    }
}

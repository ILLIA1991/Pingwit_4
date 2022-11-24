package org.example.treninghome_1.point_1;

public class Car {
    //Statica odna dla vseh
    static Integer serialNumber = 777;
    final String producer;
    Integer year = 44;



    public Car(String producer, Integer year) {
        this.producer = producer;
        this.year = year;
    }

    public Car(String producer) {
        System.out.println("year=" + year);
        this.producer = producer;
        // this всегда идет первой строкой
    }

    public Car() {
        this("Default producer", 2022);
        year = 2033;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                '}';
    }

    Integer getSerialNumber() {
        return serialNumber;
    }

    void setSerialNumber(Integer number) {
        serialNumber = number;
    }
}

package org.example.treninghome_1.point_2;

public class Building {
    static int floor = 100;

    public Building() {
        System.out.println("Automatic");
        this.floor = 200;
    }

    {
        System.out.println("Volume");
        this.floor = 300;
    }

    static {
        System.out.println("Super Star");
        floor = 300;
    }
}

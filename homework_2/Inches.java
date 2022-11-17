package org.example.homework_2;

public class Inches {
    public static void main(String[] args) {
        double a = 2.54;
        int b;
        int i = 1;
        System.out.println("Size of an inch in centimeters");
        for (b = 1; b <= 20; b++) {
            System.out.print(i++ + " = ");
            System.out.println(b * a);
        }
    }
}

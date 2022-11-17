package org.example.homework_2;

public class Ameoba {
    public static void main(String[] args) {
        int ameoba = 1;
        for (int j = 0; j <= 24; j = j + 3, ameoba *= 2) {
            System.out.println("In" + j + "hr - " + " " + ameoba);
        }
    }
}

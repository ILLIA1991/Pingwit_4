package org.example.homework_2.task_1;

// название класса с большой буквы
public class Trening {
    public static void main(String[] args) {
        int km = 10;
        System.out.println(km);
        for (int j = 1; j < 7; j++) {
            km += km * 0.1;
            System.out.println(km);
        }
    }
}

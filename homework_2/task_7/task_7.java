package org.example.homework_2.task_7;

public class task_7 {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                j += i;
                System.out.println(j);
            }
        }
    }
}

package org.example.homework_2.task_3;

public class Addition {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i <= 8; i++) {
            j += 1 << i;
            System.out.println(j);
        }
    }

}

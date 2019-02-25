package xyz;

import java.util.Scanner;

public class DAUDI {
    public static void main(String[] args) {
        String[] workers;
        int num;
        Scanner take;
        take = new Scanner(System.in);
        System.out.println("How many employees");
        num = take.nextInt();
        workers = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter employee " + (i + 1));
            workers[i] = take.next();
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Enter employee" + (i + 1) + " " + workers[i]);
        }
    }
}

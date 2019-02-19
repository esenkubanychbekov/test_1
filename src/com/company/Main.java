package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String a = "Привет,";
        String b = "Мир!";
        String c = a + b;
        System.out.println(c);


        String greeting = "Доброго времени суток, как Вас зовут ?";
        System.out.println(greeting);
        Scanner name = new Scanner(System.in);
        String name_1 = name.nextLine();
        System.out.println("Здраствуйте "+ name_1 + ", рад знакомству!!!");
    }
}

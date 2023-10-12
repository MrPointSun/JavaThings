package org.example;

public class Printer {
    public static void main(String[] args) {
        String name = "sss";
        int age = 12;
        print(name, age);
    }

    public static <v,k> void print(k val1, v val2){
        System.out.println(val1);
        System.out.println(val2);
    }
}

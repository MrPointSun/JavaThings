package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class GenericTest2 {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("icon");
        age.add(18);
        number.add(314);

//        getUperNumber(name);//1
        getUperNumber(age);//2
        getUperNumber(number);//3

    }

    public static void getData(@NotNull List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void getUperNumber(@NotNull List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
}

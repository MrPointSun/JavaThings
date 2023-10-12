package org.example;

import java.util.*;

public class GenericTest {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
}

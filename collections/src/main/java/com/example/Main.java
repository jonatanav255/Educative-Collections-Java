package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.set(1, "4");

        list.contains("1");

        System.out.println(list);

    }
}

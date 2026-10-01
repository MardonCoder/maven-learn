package com.mardon;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<String> al = new ArrayList<>(List.of("1","2","3"));
        al.stream().forEach(System.out::println);

    }
}

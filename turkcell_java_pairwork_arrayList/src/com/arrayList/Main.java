package com.arrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        myArrayList<Integer> list = new myArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.size());

        System.out.println(list.contains(1));

        list.remove(1);

        System.out.println(list.size());

        System.out.println(list.contains(1));
    }
}

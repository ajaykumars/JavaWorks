package com.ajaykumars.advanced.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsUsage<E> {

    public <T extends Number & Runnable> void printList1(List<T> list) {


    }

    public <T> void printList2(List<? extends Number> list, T index) {

        System.out.println();

    }

    public static void method(ArrayList<?> parameter) {

    }


    public static void main(String[] args) {

        ArrayList<? super Integer> list = new ArrayList<Object>();

    }

}

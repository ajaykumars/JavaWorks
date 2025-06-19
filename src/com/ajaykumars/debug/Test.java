package com.ajaykumars.debug;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        printMessage("Namaste", 3);

        Consumer<String>    print = System.out::println;

        List<String> al = Arrays.asList(new String[]{"aaa", "saddsa"});

        al.forEach(print);

        Stack<String> st = new Stack();

        st.push("CCC");
        st.push("CC1");
        st.push("CC2");
        st.push("CC2");

        st.forEach(print);

        st.pop();
        st.pop();
        System.out.println("----");
        st.forEach(print);


    }

    public static void printMessage(String message, int times) {

        //times++;

        Runnable runnable = () -> {
            for (int i = 0; i < times; i++) {
                System.out.println(message);
            }
        };

        runnable.run();


    }

}

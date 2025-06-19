package com.ajaykumars.debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quick {



    public static void main(String[] args) {

        List<String> al = Arrays.asList(new String[]{"aaa", "saddsa"});
        List<Integer> a2 = Arrays.asList(new Integer[]{1, 2});

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("ajay");
        al1.add("jay");


        System.out.println(Arrays.toString(al.toArray()));
        System.out.println(al1);

    }
}

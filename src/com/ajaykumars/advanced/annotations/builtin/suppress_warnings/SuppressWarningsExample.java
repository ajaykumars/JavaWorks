package com.ajaykumars.advanced.annotations.builtin.suppress_warnings;

import java.util.ArrayList;

/**
 * Created by ajaykumars on 10/9/2017.
 */
public class SuppressWarningsExample {

    @SuppressWarnings({"deprecation","unchecked"})
    public static void main(String args[]){

        new SuppressWarningsExample().showDeprecatedMessage();

        ArrayList list = new ArrayList();
        list.add("Java");

        System.out.println(list);

    }


    @Deprecated
    public void showDeprecatedMessage(){
        System.out.println("This method is marked as deprecated");
    }

}

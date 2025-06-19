package com.ajaykumars.advanced.annotations.builtin.deprecated;

import com.ajaykumars.advanced.annotations.builtin.suppress_warnings.SuppressWarningsExample;

/**
 * Created by ajaykumars on 10/9/2017.
 */
public class DeprecationExample {

    @SuppressWarnings({"deprecation"})
    public static void main(String args[]) {

        new SuppressWarningsExample().showDeprecatedMessage();

    }


    @Deprecated
    public void showDeprecatedMessage() {
        System.out.println("This method is marked as deprecated");
    }


}

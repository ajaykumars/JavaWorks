package com.ajaykumars.basics.std_in_out;

import java.util.Scanner;

public class StdInOut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String dataType = "Not Known";

        if (input.matches("\\d+")) {
            dataType = "java.lang.Integer";
        }

        // checking for floating point numbers
        else if (input.matches("\\d*[.]\\d+")) {
            dataType = "java.lang.Double";
        } else {

            dataType = "java.lang.String";
        }

        System.out.println(dataType);
    }
}

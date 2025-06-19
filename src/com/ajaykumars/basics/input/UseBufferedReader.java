package com.ajaykumars.basics.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseBufferedReader {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader.readLine());


    }
}

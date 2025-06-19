package com.ajaykumars.spring.dependency_injection.example_1;

/**
 * Created by ajaykumars on 7/9/2017.
 */
public class Writer {

    public void drawShape(Shape shape) {

        shape.draw();

    }

    public static void main(String[] args) {

        new Writer().drawShape(new Triangle());
        new Writer().drawShape(new Circle());


    }

}

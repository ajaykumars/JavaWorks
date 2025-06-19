package com.ajaykumars.basics.nested_classes;

interface Executable {

    void execute();

}

public class AnonymousClassExample {

    public void run() {

        new Executable() {

            @Override
            public void execute() {
                System.out.println("Running from Anonymous Class");
            }
        }.execute();
    }

    public static void main(String[] args) {
        new AnonymousClassExample().run();
    }
}

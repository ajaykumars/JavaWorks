package com.ajaykumars.java8.method_reference.example_3;

public class FunctionalInterfaceMethodReferenceExample {

    public void doSomething(Task task) {
        task.printName("Alex");
    }

    public static void displayName(String name) {
        System.out.println("Your name is " + name);
    }

    public void displayFirstName(String name) {
        System.out.println("Your name is " + name);
    }

    public static void main(String[] args) {

        Task task = FunctionalInterfaceMethodReferenceExample::displayName;
        Task task2 = new FunctionalInterfaceMethodReferenceExample()::displayFirstName;
        FunctionalInterfaceMethodReferenceExample fimre = new FunctionalInterfaceMethodReferenceExample();
        Task task3 = fimre::displayFirstName;
        new FunctionalInterfaceMethodReferenceExample().doSomething(FunctionalInterfaceMethodReferenceExample::displayName);

        task2.printName("Alice");

        task3.printName("Alice+Alex");

        iTask task4 = SimpleTask::new;
        task4.doSomething("Alice-construct");

        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }

    interface iTask {
        SimpleTask doSomething(String name);
    }

    static class SimpleTask {

        SimpleTask(String name) {
            System.out.println("From constructor : " + name);
        }
    }

    interface Messageable {
        Message getMessage(String msg);
    }

    static class Message {
        Message(String msg) {
            System.out.print(msg);
        }
    }


}

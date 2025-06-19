package com.ajaykumars.basics.interfaces_abstract_classes;

public class Employee extends AbstractPerson implements Onboardable, Fireable {

    @Override
    public void printDetails() {

        System.out.println("Employee : " + this.getName() + " is of age : " + this.getAge());
    }

    @Override
    public void fire() {
        System.out.println("Employee : " + this.getName() + " is fired.");
    }

    @Override
    public void onboard() {
        System.out.println("Employee : " + this.getName() + " is onboarded.");
    }

    @Override
    public void paySalary() {
        System.out.println("Employee : " + this.getName() + " is paid.");
    }
}

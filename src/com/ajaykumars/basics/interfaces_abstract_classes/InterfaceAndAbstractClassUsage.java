package com.ajaykumars.basics.interfaces_abstract_classes;

public class InterfaceAndAbstractClassUsage {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setAge(33);
        employee.setName("Hari Kumar");

        employee.printDetails();
        intiateOnboardingProcedure(employee);
        intiateFiringProcedure(employee);

    }

    public static void intiateFiringProcedure(Fireable fireablePerson) {

        fireablePerson.fire();

    }

    public static void intiateOnboardingProcedure(Onboardable onboardablePerson) {

        onboardablePerson.onboard();
        onboardablePerson.paySalary();
    }

}

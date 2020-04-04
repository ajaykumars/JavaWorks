package com.ajaykumars.java8.default_methods.example_1;


import com.sun.istack.internal.NotNull;


/**
 * Created by ajaykumars on 6/26/2017.
 */
public interface Lovable {

    public String getName();
    public int getAge();

    public void setName(String name);
    public void setAge(int age);

    default String getInfo(){

        return this.getName() + " : " + this.getAge();

    }

    @NotNull
    static String getInfo(Person p){

        return p.getName() + " : " + p.getAge();
    }

}

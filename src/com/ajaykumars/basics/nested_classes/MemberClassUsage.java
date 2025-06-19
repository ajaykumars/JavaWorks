package com.ajaykumars.basics.nested_classes;

public class MemberClassUsage {


    public static void main(String[] args) {

        MemberClassExample members = new MemberClassExample();

        members.addMember(members.new Member("Monthy", 29, "Yearly"));
        members.addMember(members.new Member("Molley", 25, "Permanent"));

        members.getMembers().forEach(member -> {
            System.out.println(member.getName() + " with age " + member.getAge() + " years has " + member.getMemberType() + " membership");
        });

        //MemberClassExample.Member member = new MemberClassExample().new Member();


    }

}

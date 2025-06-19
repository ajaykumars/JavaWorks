package com.ajaykumars.basics.nested_classes;

import java.util.ArrayList;
import java.util.List;

public class MemberClassExample {

    private List<Member> members = new ArrayList<>();

    public List<Member> getMembers() {
        return members;
    }

    public void addMember(String name, int age, String memberType) {
        members.add(new Member(name, age, memberType));
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public class Member {

        private String name;
        private int age;
        private String memberType;

        {
            name = "Not Set";
            age = -1;
            memberType = "unknown";
        }

        public Member(String name, int age, String memberType) {
            this.name = name;
            this.age = age;
            this.memberType = memberType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getMemberType() {
            return memberType;
        }

        public void setMemberType(String memberType) {
            this.memberType = memberType;
        }
    }
}

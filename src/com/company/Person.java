package com.company;

public class Person implements Cloneable {
    private String name,adrress;
    private int age;

    public Person(String name, String adrress, int age) {
        this.name = name;
        this.adrress = adrress;
        this.age = age;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

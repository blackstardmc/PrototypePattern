package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        
        try {

            Person a = new Person("Alberto", "New Jersey", 25);
            Person b = (Person) a.clone();
            b.setName("Miguel");

            System.out.println(a.getName() + " " + a.getAge() + " " + a.getAdrress());
            System.out.println(b.getName() + " " + b.getAge() + " " + b.getAdrress());

        } catch (CloneNotSupportedException x) {
            System.out.println(x.getMessage());
        }
    }
}
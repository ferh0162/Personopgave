package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person1 = new Person("Ferhat", 19);

        System.out.println(person1.toString());
        person1.hasBirthday();
        System.out.println(person1.toString());

    }
}

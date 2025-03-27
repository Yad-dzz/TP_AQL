package org.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty or null");
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty or null");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
package com.aayla;

/*
 Started at 1:44pm
 Finished at 2:12pm

 Name: Aayla Fetzer
 Date: July 22nd, 2020
 Time Taken: 28 minutes
 */

import java.util.ArrayList;
import java.util.Comparator;

class Student {
    String firstName;
    String lastName;
    String email;
    String id;  // Maybe just an integer? Nobody said if IDs are decimal, hexadecimal, etc.

    public Student(String firstName, String lastName, String email, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Main {
    static ArrayList<Student> studentArrayList = new ArrayList<>();
    static void addStudent(Student newStudent) {
        // Add a student
        studentArrayList.add(newStudent);
        // Sort the Array by last name to keep it in order
        studentArrayList.sort(Comparator.comparing(s -> s.lastName));
    }
    static void removeStudentById(String id) {
        // Remove students given their ID
        studentArrayList.removeIf(student -> id.equals(student.getId()));
    }
    static void removeStudentByEmail(String email) {
        // Remove students given their email address
        studentArrayList.removeIf(student -> email.equals(student.getEmail()));
    }
    public static void main(String[] args) {
        // Test code to add and remove students
        addStudent(new Student("Aayla", "Fetzer", "aayla@afetzer.com", "0"));
        addStudent(new Student("Obi-Wan", "Kenobi", "okenobi@jedi.gov", "1"));
        addStudent(new Student("General", "Greivous", "greivous@separatist.net", "2"));
        addStudent(new Student("James", "Bond", "strappedto.lasertable@badfilm.co.uk", "3"));
        // Print the list before removing a student
        System.out.println(studentArrayList);
        removeStudentByEmail("greivous@separatist.net");
        // Print the list
        System.out.println(studentArrayList);
    }
}

package entities;

import java.util.Objects;

public abstract class person {



    protected String firstName;
    protected String lastName;
    protected String email;
    protected String address;
    protected int age ;


    public person(){};
    public person(String firstName, String lastName, String email, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.age = age;
    }



    public person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;}



public abstract String getRole();
    public abstract String getUniqueId();


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmail(), getAddress(), getAge());
    }


    public String getFullName(){
        return firstName + " " + lastName;
    }



    public boolean isAdult(){
        if (age >= 18) return true;
        else return false;
    }


    public void printdetails(){
        System.out.println("Name: " + getFullName());
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

















}

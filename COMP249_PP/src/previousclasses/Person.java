package previousclasses;

import previousclasses.Address;

public class Person {

    // Data attributes
    protected String name;
    protected int age;
    protected Address address;

    // Constructors
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age, int streetNumber, String streetName,
            String zipCode, String cityName) {
        this.name = name;
        this.age = age;
        this.address = new Address(streetNumber, streetName, zipCode, cityName);

    }

    public Person(int age) {
        this("", age, new Address());
    }

    public Person(String name, int age) {
        this(name, age, new Address());
    }

    public Person() {
        this("", 0, new Address());
    }

    // Copy constructor
    public Person(Person person) { // Be very carefull with the below code
        this(person.name, person.age, new Address(person.address)); // With a deep copy of the address
        //this.name = person.name;
        //this.age = person.age;
        //this.address = person.address; // Shallow copy
        //this.address = new Address(person.address);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Address getAddress() {
        return new Address(this.address);
    }

    // toString
    @Override
    public String toString() {

        //if (this.address.equals("")) {
        //return "This is " + this.name + " whose age is " + this.age;
        //} else {
        return "This is " + this.name + " whose age is " + this.age + " living in " + this.address;
        //}
    }

    public void f() {
        System.out.println("From Person class.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
        Person otherPerson = (Person) obj;

        if (address.equals(otherPerson.address)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected Person clone() {
        return new Person(this);
    }
}

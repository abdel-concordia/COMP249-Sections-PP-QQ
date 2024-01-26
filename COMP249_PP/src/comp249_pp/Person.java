package comp249_pp;

public class Person {

    // Data attributes
    private String name;
    private int age;
    private String address;

    // Constructors
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(int age) {
        this("", age, "");
    }

    public Person(String name, int age) {
        this(name, age, "");
    }

    public Person() {
        this("", 0, "");
    }

    // Copy constructor
    public Person(Person person) { // Be very carefull with the below code
        this.name = person.name;
        this.age = person.age;
        this.address = person.address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    // toString
    @Override
    public String toString() {

        if (this.address.equals("")) {
            return "This is " + this.name + " whose age is " + this.age;
        } else {
            return "This is " + this.name + " whose age is " + this.age + " living in " + this.address;
        }
    }

    public Person stupid() {
        return new Person(this);
    }

}

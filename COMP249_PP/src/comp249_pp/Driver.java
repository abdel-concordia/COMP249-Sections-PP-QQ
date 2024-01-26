package comp249_pp;

public class Driver {

    public static void main(String[] args) {

        Person p1 = new Person("John", 20, "Montreal");
        Person p2 = new Person("Jane", 19);
        Person p3 = new Person(17);
        Person p4 = new Person(); // Default constructor

        System.out.println(p1);
        f(p1);
        System.out.println(p1);

    }

    public static void f(Person p) {
        //p.setName("New name");
        p = new Person("New name", 60, "Laval");
    }

}

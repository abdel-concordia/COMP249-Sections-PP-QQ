package comp249_pp;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Address ad1 = new Address(1234, "Ste-Catherine", "H3", "Montreal");
        Address ad2 = new Address(1234, "Ste-Catherine", "H3", "Montreal");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Object s1;
        if (number % 2 == 0) {
            s1 = new Student("Jane", 19, ad1, "Biology", 3.7);
        } else {
            s1 = new Person("John", 18, ad1);
        }

        Student s2 = new Student("John", 20, ad2, "CS", 3.7);

        Person s3 = new Person(s1);

        Person s4 = s1.clone();

        if (s1.equals(s2)) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal");
        }

        Person p1 = new Person("John", 20, ad1);

        Person[] myStudents = new Student[5];

        //myStudents[0].f();
        //myStudents[0] = s1;
        //myStudents[1] = p1;
        s1.f();

        s2.f();

        //Person p1 = new Person("John", 20, ad1);
        //Person p2 = new Person("John", 20, ad2);
        //System.out.println(p1.equals(p2));
        /*
        Student s1 = new Student("John", 20, ad1, "CS", 3.7);
        Student s2 = new Student("John", 20, ad2, "CS", 3.7);

        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
         */
//        System.out.println(s1 instanceof Student);
//        System.out.println(s1 instanceof Person);
//        System.out.println(s1 instanceof Object);
        // getClass()
        //System.out.println(s1.getProgramOfStudy());
        //Person p1 = new Person("John", 20, ad);
        //Person p2 = new Person("Jane", 19, new Address(5678, "Guy", "H3", "Montreal"));
        //Person p3 = new Person("Jane", 19, 5678, "Guy", "H3", "Montreal");
        //Person p4 = new Person(p1);
        //Address ad2 = p1.getAddress();
        //System.out.println(ad2);
        //ad2.setCityName("Sherbrooke");
        //System.out.println(p1.getAddress().getCityName());
        //p4.setName("New Name");
        //System.out.println(p1.getName());
        //System.out.println(p4.getName());
        //p4.getAddress().setCityName("Laval");
        //System.out.println(p1.getAddress().getCityName());
        //System.out.println(p4.getAddress().getCityName());
        //Person p3 = new Person(17);
        //Person p4 = new Person(); // Default constructor
        //System.out.println(p1);
        //f(p1);
        //System.out.println(p1);
        //int a = 5;
        //g(a);
        //System.out.println("After calling g: " + a);
    }
    /*
    public static void g(int x) {
        x = x + 5;
        System.out.println("In method g: " + x);
    }

    public static void f(Person p) {
        //p.setName("New name");
        //p = new Person("New name", 60, "Laval");
    }
     */
}

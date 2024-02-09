package comp249_pp;

public class Driver extends Object {

    public static void main(String[] args) {

        Address ad = new Address(1234, "Ste-Catherine", "H3", "Montreal");
        Student s1 = new Student("John", 20, ad, "CS", 3.7);

        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Person);
        System.out.println(s1 instanceof Object);

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

package comp249_pp;

public class Student extends Person {

    private String programOfStudy;
    private double gpa;

    // Constructor
    public Student(String name, int age, Address address,
            String programOfStudy, double gpa) {
        super(name, age, address);
        this.programOfStudy = programOfStudy;
        this.gpa = gpa;
        this.name = "ggg";
    }

    // Setters
    public void setProgramOfStudy(String pos) {
        this.programOfStudy = pos;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // Getters
    public String getProgramOfStudy() {
        return this.programOfStudy;
    }

    public double getGPA() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", enrolled in " + this.programOfStudy + " with a GPA of " + this.gpa;
    }

    @Override
    public void g() {
        super.g();
    }

}

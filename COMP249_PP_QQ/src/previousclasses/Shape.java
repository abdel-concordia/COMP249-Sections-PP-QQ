package previousclasses;

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double calculatePerimeter();

    public void f() {
        System.out.println("From Shape");
    }

}

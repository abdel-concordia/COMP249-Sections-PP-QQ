package comp249_pp_qq;

public class Driver {

    public static void main(String[] args) {

        Shape t1 = new Triangle("TR1", 2, 4, 6);

        Rectangle r1 = new Rectangle("R1", 7, 3);

        final int ARRAY_SIZE = 5;

        Shape[] myShapes = new Shape[ARRAY_SIZE];

        myShapes[0] = t1;
        myShapes[1] = r1;
        myShapes[2] = new Circle("C1", 3.2);

        //for (int i = 0; i < ARRAY_SIZE; i++) {
        //    System.out.println(myShapes[i].calculatePerimeter());
        //}
        // Enhanced loop
        for (Shape shape : myShapes) {
            if (shape != null) {
                //shape.f();
                System.out.println(shape.calculatePerimeter());
            }
        }

    }
}

package previousclasses;

public class MyExceptionClassExampleDriver {

    public static void main(String[] args) {
        Course c1 = null;
        try {
            c1 = new Course("COMP 249", -3.5);
        } catch (MyException mx) {
            System.out.println(mx.getMinimumCreditPoints());
        } catch (Exception ex) {

        }
        System.out.println(c1);
    }
}

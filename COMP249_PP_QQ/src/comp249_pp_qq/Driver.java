package comp249_pp_qq;

public class Driver {

    public static void main(String[] args) throws Exception {
        Course c1 = null;
        try {
            c1 = new Course("COMP 249", -3.5);
        } catch (MyException mx) {
            System.out.println(mx.getMinimumCreditPoints());
        }
        System.out.println(c1);
    }

}

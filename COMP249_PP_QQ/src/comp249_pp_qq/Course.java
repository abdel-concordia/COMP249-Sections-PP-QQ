package comp249_pp_qq;

public class Course {

    private String title;
    private double creditPoints;

    public Course(String title, double creditPoints) throws Exception {

        if (title.equals("")) {
            Exception ex = new Exception("Bad course title");
            throw ex;
        } else {
            this.title = title;
        }

        if (creditPoints < 0 || creditPoints > 4) {
            throw new MyException("Wrong credit points.", 2, 4);
        }
        this.creditPoints = creditPoints;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(double creditPoints) {
        this.creditPoints = creditPoints;
    }

    @Override
    public String toString() {
        return "Course: " + this.title + " and credits: " + this.creditPoints;
    }
}

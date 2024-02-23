package comp249_pp_qq;

public class MyException extends Exception {

    private double minimumCreditPoints;
    private double maximumCreditPoints;

    public MyException(String message, double minimumCreditPoints, double maximumCreditPoints) {
        super(message);
        this.minimumCreditPoints = minimumCreditPoints;
        this.maximumCreditPoints = maximumCreditPoints;
    }

    public double getMinimumCreditPoints() {
        return minimumCreditPoints;
    }

    public void setMinimumCreditPoints(double minimumCreditPoints) {
        this.minimumCreditPoints = minimumCreditPoints;
    }

    public double getMaximumCreditPoints() {
        return maximumCreditPoints;
    }

    public void setMaximumCreditPoints(double maximumCreditPoints) {
        this.maximumCreditPoints = maximumCreditPoints;
    }

}

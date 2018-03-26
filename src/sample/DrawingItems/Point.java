package sample.DrawingItems;

public class Point implements java.io.Serializable{
    private double x;
    private double y;

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }



    //override string
    public String toString() {
        return "("+ x + ", " + y + ")";
    }
}

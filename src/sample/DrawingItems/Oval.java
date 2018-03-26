package sample.DrawingItems;

public class Oval extends DrawingItem implements java.io.Serializable{
    private Point anchor;
    private double width;
    private double height;
    private double weight;

    @Override
    public Point getAnchor() {
        return this.anchor;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Oval(Point anchor, double width, double height, double weight) {
        this.anchor = anchor;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    //painting IPaintable
    //TODO: PAINTABLE

    public void paintUsing(IPaintable paintable) {
        paintable.paint(this);

    }


    //oval override string
    public String toString() {
        return  "Oval Anchor: (" + getAnchor().getX() + ", " + getAnchor().getY() + "), height: "+ getHeight() + ", width: " + getWidth();

    }


}

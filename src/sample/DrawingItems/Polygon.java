package sample.DrawingItems;

public class Polygon extends DrawingItem implements java.io.Serializable{

    private Point[] vertices;
    public Point[] getVertices() {
        return this.vertices;
    }

    @Override
    public Point getAnchor() {

        double minx = vertices[0].getX();
        for (int counter = 0; counter<vertices.length; counter++) {
            if( vertices[counter].getX() < minx) {
                minx = vertices[counter].getX();
            }
        }

        double miny = vertices[0].getY();
        for (int counter = 0; counter<vertices.length; counter++) {
            if( vertices[counter].getY() < miny) {
                miny = vertices[counter].getY();
            }
        }

         Point anchor = new Point(minx, miny);
        return anchor;
    }

    @Override
    public double getHeight() {
        double max = vertices[0].getX();
        for (int counter = 0; counter<vertices.length; counter++) {
            if( vertices[counter].getX() > max) {
                max = vertices[counter].getX();
            }
        }
        return max;
    }


    @Override
    public double getWidth() {
        double max = vertices[0].getY();
        for (int counter = 0; counter<vertices.length; counter++) {
            if( vertices[counter].getY() > max) {
                max = vertices[counter].getY();
            }
        }
        return max;
    }



    private double weight;

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Polygon(Point[] vertices, double weight) {
        this.vertices = vertices;
        this.weight = weight;
    }

    //TODO: PAINTABLE

    public void paintUsing(IPaintable paintable) {
        paintable.paint(this);
    }

    //override polygon tostring (test);
    public String toString() {
       return  "Polygon Anchor: (" + getAnchor().getX() + ", " + getAnchor().getY() + "), height: "+ getHeight() + ", width: " + getWidth();
    }

    public double[] getXPoints() {
        double[] xPoints = new double[vertices.length];
        for (int counter = 0; counter<vertices.length; counter++) {
            xPoints[counter] = vertices[counter].getX();
        }

        return xPoints;

    }

    public double[] getYPoints() {
        double[] yPoints = new double[vertices.length];
        for (int counter = 0; counter<vertices.length; counter++) {
            yPoints[counter] = vertices[counter].getY();
        }

        return yPoints;

    }



}

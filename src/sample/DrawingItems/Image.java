package sample.DrawingItems;

import java.io.File;

public class Image extends DrawingItem{

    private File file;
    private Point anchor;
    private double width;
    private double height;

    @Override
    public Point getAnchor() {
        return this.anchor;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }


    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    //TODO: PAINTABLE

    public void paintUsing(IPaintable paintable) {

    }

    public Image(File file, Point anchor, double width, double height) {
        this.file = file;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }


}

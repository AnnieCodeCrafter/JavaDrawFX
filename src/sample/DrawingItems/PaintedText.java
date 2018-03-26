package sample.DrawingItems;

public class PaintedText extends DrawingItem {

    private String content;
    private String fontName;
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

    public String setContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;

    }

    //TODO: PAINTABLE

    public void paintUsing(IPaintable paintable) {
        paintable.paint(this);
    }

    public String getFontName() {
        return this.fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }


}

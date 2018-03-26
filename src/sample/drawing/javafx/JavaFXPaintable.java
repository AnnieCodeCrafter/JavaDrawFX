package sample.drawing.javafx;
import javafx.scene.canvas.GraphicsContext;
import sample.DrawingItems.*;
import javafx.fxml.FXML;

public class JavaFXPaintable implements IPaintable{

    public GraphicsContext graphics;

    public JavaFXPaintable(GraphicsContext graphics) {
        this.graphics = graphics;
    }

    @Override
    public void paint(Oval oval) {
        graphics.fillOval(oval.getAnchor().getX(), oval.getAnchor().getY(), oval.getWidth(), oval.getHeight());
    }

    @Override
    public void paint(Polygon polygon) {
         graphics.fillPolygon(polygon.getXPoints(), polygon.getYPoints(), polygon.getVertices().length);
    }

    @Override
    public void paint(PaintedText text) {

    }

    @Override
    public void paint(Image image) {

    }
}

package sample.drawing.javafx;

import sample.DrawingItems.Drawing;

import java.util.Properties;

public interface PersistencyMediator {
    Drawing load(String nameDrawing);

    boolean save(Drawing drawing);

    boolean init(Properties props);
}

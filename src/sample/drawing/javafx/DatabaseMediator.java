package sample.drawing.javafx;

import sample.DrawingItems.Drawing;

import java.util.Properties;

public class DatabaseMediator implements PersistencyMediator {
    @Override
    public Drawing load(String nameDrawing) {
        return null;
    }

    @Override
    public boolean save(Drawing drawing) {
        return false;
    }

    @Override
    public boolean init(Properties props) {
        return false;
    }

    public void closeConnection() {

    }

    public void initConnection() {

    }
}

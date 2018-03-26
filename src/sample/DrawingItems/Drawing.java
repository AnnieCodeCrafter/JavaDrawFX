package sample.DrawingItems;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import sample.drawing.javafx.JavaFXPaintable;
import java.util.*;
import javafx.collections.*;



public class Drawing implements java.io.Serializable {
    private String name;
    public ArrayList<DrawingItem> items = new ArrayList<DrawingItem>();

    public String getString() {
        return this.name;
    }

    public void setString(String name) {
        this.name = name;
    }

    private ObservableList<DrawingItem> observableList;
    private List<DrawingItem> DrawingItems;



    public void AddItems(DrawingItem item) {
        items.add(item);
    }

    public void paintUsing(IPaintable paintable) {
        for(DrawingItem item : items) {
                item.paintUsing(paintable);
        }
    }

    public List<DrawingItem> getDrawingItems() {
        return Collections.unmodifiableList(items);
    }

    public ObservableList<DrawingItem> itemsToObserve() {

        return FXCollections.
                unmodifiableObservableList(observableList);

    }



    public List<DrawingItem> GetItems() {
        Collections.sort(items, new DrawingComparator());
        return Collections.unmodifiableList(items);

    }



    public Drawing(String name) {
      this.name = name;
    }

    public ObservableList<DrawingItem> getObservableList() {
        ObservableList<DrawingItem> observableList = FXCollections.observableList(items);
        return FXCollections.unmodifiableObservableList(observableList);
    }


}

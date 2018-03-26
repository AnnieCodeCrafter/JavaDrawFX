package sample.drawing.javafx;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import sample.DrawingItems.*;
import sample.drawing.javafx.JavaFXPaintable;
import java.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.*;
import java.util.*;


public class Controller implements Initializable {
@FXML
private Canvas canvas;

//fields for oval coordinates

    @FXML private TextField OvAnchorX;

    @FXML private TextField OvAnchorY;

    @FXML private TextField WidthOv;

    @FXML private TextField HeightOv;

    @FXML private TextField WeightOv;


    //other stuff
private JavaFXPaintable javaFXPaintable;
private Drawing drawing = new Drawing("FirstDrawing");
private SerializationMediator med = new SerializationMediator();

    private ArrayList<DrawingItem> messlist = new ArrayList<DrawingItem>();



    @FXML private ComboBox combobox;

//add oval
    @FXML
    public void Oval() {
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        this.javaFXPaintable = new JavaFXPaintable(gc);

        try {
            // take the things from textfields and put them into int
            //make sure they're filled
                int AnchorX = Integer.parseInt(OvAnchorX.getText());
                int AnchorY = Integer.parseInt(OvAnchorY.getText());
                int Width = Integer.parseInt(WidthOv.getText());
                int Height = Integer.parseInt(HeightOv.getText());
                int Weight = Integer.parseInt(WeightOv.getText());

            //draw the oval with them
            drawing.AddItems(new Oval(new Point(AnchorX, AnchorY), Width, Height, Weight));
            this.drawing.paintUsing(this.javaFXPaintable);



            //add to ObservableList?
            setItems(drawing.getObservableList());

        }

        catch(NumberFormatException e){
            System.out.println("Please fill the textboxes with numbers.");

        }

    }

    //add polygon
    @FXML
    public void Polygon() {
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        this.javaFXPaintable = new JavaFXPaintable(gc);
        drawing.AddItems(new Polygon(new Point[]{new Point(50, 100), new Point(50, 50), new Point(70, 10), new Point(100, 30)}, 5));
        this.drawing.paintUsing(this.javaFXPaintable);
        setItems(drawing.getObservableList());

    }

    @FXML
    public void saveShit() {
        if(drawing.GetItems().isEmpty()) {
            System.out.println("There are no items in Drawing");

        }

        else {
            med.save(drawing);
        }

    }

    @FXML
    private void exitCalculator(){
        System.exit(1);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void setItems(ObservableList<DrawingItem> list) {
       // drawing.itemsToObserve();

        combobox.setItems(list);


    }

    @FXML
    public void DeleteFromList() {
        int selectedIdx = combobox.getSelectionModel().getSelectedIndex();
        if (selectedIdx != -1) {
            for(int i = 0; i < drawing.getObservableList().size(); i ++) {
                if(i != selectedIdx) {
                    messlist.add(drawing.getObservableList().get(i));
                }
            }
        }
    }

    public void Reset() {

      //  drawing.getObservableList().clear();
      //  for(int i = 0; i < messlist.size(); i ++){
     //       drawing.getObservableList().add(messlist.get(i));
      //  }

      //  combobox.setItems(drawing.getObservableList());
       


    }

}

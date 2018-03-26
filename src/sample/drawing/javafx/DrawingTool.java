package sample.drawing.javafx;
import javafx.stage.StageStyle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.DrawingItems.Drawing;
import sample.DrawingItems.Oval;
import sample.DrawingItems.Point;
import sample.DrawingItems.Polygon;


public class DrawingTool extends Application{



    SerializationMediator med = new SerializationMediator();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Parent root = FXMLLoader.load(getClass().getResource("DrawStuff.fxml"));
        primaryStage.setTitle("DrawFX");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        // java paint scene graphics context?



    }

    public static void main(String[] args) {
        launch(args);
        Point a = new Point(2,3);
        Point b = new Point(1,5);
        Point c = new Point(4,7);
        Point d = new Point(5,5);
        Point e = new Point(5,2);

        Point[] pAr = {a, b, c, d, e};

        Polygon P = new Polygon(pAr, 4);

        String F = a.toString();

        Oval O = new Oval(a, 5, 3, 4);





    }
}

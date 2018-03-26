package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.DrawingItems.*;
import javafx.scene.canvas.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{






    }

    public static void main(String[] args) {

        //points
        Point a = new Point(2,3);
        Point b = new Point(1,5);
        Point c = new Point(4,7);
        Point d = new Point(5,5);
        Point e = new Point(5,2);

        Point[] pAr = {a, b, c, d, e};

        Polygon P = new Polygon(pAr, 4);

        String F = a.toString();

        Oval O = new Oval(a, 5, 3, 4);

        // printout
        System.out.println(P.toString());
        System.out.println(O.toString());
        launch(args);


    }
}

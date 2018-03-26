package sample.drawing.javafx;
import java.io.*;
import sample.DrawingItems.Drawing;

import java.util.Properties;



public class SerializationMediator implements PersistencyMediator {
    @Override
    public Drawing load(String nameDrawing) {

        return null;
    }

    @Override
    public boolean save(Drawing drawing) {
        //return false;
        String drawstring  = drawing.getString();
        try {
            FileOutputStream fileOut =
                    new FileOutputStream( drawstring + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(drawing);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/" + drawstring + ".ser");
            return true;
        } catch (IOException i) {
            i.printStackTrace();
            return false;
        }


    }

    @Override
    public boolean init(Properties props) {
        return false;
    }
}

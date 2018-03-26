package sample.DrawingItems;

import java.util.Comparator;

public class DrawingComparator implements Comparator<DrawingItem>{


    @Override
    public int compare(DrawingItem o1, DrawingItem o2) {

        double pyt1 = Math.sqrt((o1.getAnchor().getX() * o1.getAnchor().getX()) + (o1.getAnchor().getY() * o1.getAnchor().getY()));
        double pyt2 = Math.sqrt((o2.getAnchor().getX() * o2.getAnchor().getX()) + (o2.getAnchor().getY() * o2.getAnchor().getY()));

        if(pyt1 > pyt2) {
          return 1;
        }

        if(pyt1 < pyt2) {
            return -1;
        }

        else {
            return 0;
        }
    }
}

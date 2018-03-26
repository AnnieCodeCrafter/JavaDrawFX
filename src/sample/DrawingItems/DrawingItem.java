package sample.DrawingItems;

public abstract class DrawingItem {
      Color color;

      public abstract Point getAnchor();
      public abstract double getWidth();
      public abstract double getHeight();

      public abstract void paintUsing(IPaintable paintable);



}



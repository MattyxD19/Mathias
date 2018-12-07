package sample;

import javafx.scene.paint.Color;

public class Square
{
    int size;
    Color colorSelection;
    int positionX;
    int positionY;



    public Square(int size, Color colorSelection, int positionX, int positionY) {

        this.size = size;
        this.colorSelection = colorSelection;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Color getColorSelection() {
        return colorSelection;
    }


    public void setColorSelection() {
        this.colorSelection = colorSelection;
    }

    public int getSize() {
        return size;
    }

    public void setSize(){
        this.size = size;
    }

    public int getPositionX(){
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}

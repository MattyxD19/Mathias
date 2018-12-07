package sample;


import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Controller {

    @FXML
    public Canvas backg, foreg;

    private Board board = new Board();


    @FXML
    public void initialize()
    {
        board = new Board();
        drawBoard();

    }

    @FXML
    private void drawBoard(){
        for(Square s: this.board.getAllSquares())
        {
            drawSquare(s);
        }
    }

    @FXML
    private void drawSquare (Square s)
    {
        GraphicsContext gc = backg.getGraphicsContext2D();
        gc.setFill(s.getColorSelection());
        gc.fillRect(s.getPositionX(),s.getPositionY(),s.getSize(),s.getSize());
    }

}
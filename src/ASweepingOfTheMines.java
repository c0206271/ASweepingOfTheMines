import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.text.Text;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.lang.System.*;
import javafx.scene.control.ScrollPane;
import javafx.scene.shape.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.KeyAdapter;
import java.lang.*;
import java.util.*;
import java.lang.Math.*;
import java.lang.Object;
import javafx.scene.control.Button;

public class ASweepingOfTheMines extends Application
{@Override
    public void start(Stage stage)
    {
        GridPane grid= new GridPane();
        Button[][] buttons =new Button[16][16];

        for(int x=0; x<16; x++)
            for(int y=0; y<16;y++)
            {
                Button b1=new Button("iii");
                b1.setTranslateX(100.0);
                buttons[x][y]= b1;
            }
        for(int x=0; x<16; x++)
            for(int y=0; y<16; y++)
                grid.add(buttons[x][y],x,y,1,1);
        grid.setHgap(0);
        grid.setVgap(0);

        stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {

        });
        Group root = new Group(grid);
        Scene scene = new Scene(root, 640, 480);
        stage.setTitle("A Sweeping Of the Mines");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);

    }

}
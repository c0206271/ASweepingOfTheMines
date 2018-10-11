import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
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
import java.lang.Math;

public class ASweepingOfTheMines extends Application
{@Override
    public void start(Stage stage)
    {
        /////////////////////////////SETTING THE OBJECTS/TEXT/////////////////////////////
        Text text1 = new Text();
        text1.setText("Hello and welcome to A Sweeping Of The Mines. Press click to continue to the game.");
        text1.setX(100);
        text1.setY(450);
        text1.setFont(Font.font("arial", 14));
        text1.setStroke(Color.BLACK);
        //////////////////////////////A TRUCKLOAD OF 1-NUMBER ARRAYS CAUSE OF THAT DAMN LAMBDA SCOPE ERROR///////////////////////////////////////////////////////
        int choose[]={0};
        int[][]mines=new int[16][16];
        int[][] locations = new int[16][16];
        int[] bombx=new int[40];
        for(int x=0; x<16; x++)
            for(int y=0; y<16; y++)
                mines[x][y]=0;

        int[] bomby=new int[40];
        for(int x=0; x<40; x++)
        {
            bombx[x]=-1;
            bomby[x]=-1;
        }
        int[] sx=new int[]{0};
        int[] sy=new int[]{0};
        boolean[] ifused=new boolean[]{false};
        int[] bombct=new int[]{0};


 ////////////////////////////EVENT HANDLER/ STANDARD STUFF///////////////////////////////
        /*stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
            if(choose[0]==0)
            {
                if(key.getCode()==KeyCode.ENTER)
                {
                    text1.setText("You must now clear this Field of Mines.");
                    choose[0]++;
                }

            }
            if(choose[0]==2)
            {

            }



        });*/
        /*stage.addEventHandler(MouseEvent.MOUSE_CLICKED, (mouse) -> {
           // if(2==2)
            {
                text1.setText("wererererererere");

            }
        });*/
 ////////// ///////////////////////////////SETTING THE GRID//////////////////////

        GridPane grid= new GridPane();
        Button[][] buttons =new Button[16][16];

        for(int x=0; x<16; x++)
            for(int y=0; y<16;y++)
            {
                Button b1=new Button("iii");
                b1.setTranslateX(200.0);
                buttons[x][y]= b1;
                //locations[x][y]
                int[] a= {x};
                int[] b={y};

                b1.setOnMouseClicked(event ->
                {
                    if(choose[0]==0){
                        for(int c=0; c<40; c+=0)
                        {

                            text1.setText("alright youre playing this game woooooooooooooo");
                            sx[0]=(int)(Math.random()*16);
                            sy[0]=(int)(Math.random()*16);
                            if(mines[sx[0]][sy[0]]==9||sy[0]==a[0]&&sx[0]==b[0])
                            {
                                System.out.println("that was already used");
                            }
                            else
                            {
                                bombx[c]=sx[0];
                                bomby[c]=sy[0];
                                c++;
                                mines[sx[0]][sy[0]]=9;


                            }
                        }
                        ifused[0]=false;
                        for(int c=0; c<40; c++)
                        {
                            mines[bombx[c]][bomby[c]]=9;
                        }
                        for(int xx=0; xx<16; xx++)
                            for(int yy=0; yy<16; yy++)
                                b1.setText(""+mines[xx][yy]);
                        choose[0]++;
                        for(int q=0; q<16; q++)
                            for(int w=0; w<16; w++) {
                                buttons[q][w].setText("" + mines[q][w]);
                                if(mines[q][w]==9)
                                    bombct[0]++;
                            }
                        text1.setText("button pressed and"+bombct[0]);
                        bombct[0]=0;
                    }
                    if(choose[0]==1){


                    }
                    //text1.setText("button pressed");

                });

            }
        for(int x=0; x<16; x++)
            for(int y=0; y<16; y++)
                grid.add(buttons[x][y],x,y,1,1);
        grid.setHgap(0);
        grid.setVgap(0);

        ///////////////////////////GROUP/STANDARD/////////////////////////////////////////////////////
        Group root = new Group(grid, text1);
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("A Sweeping Of the Mines");
        stage.setScene(scene);
        stage.show();
    }

/////////////////////////////////RUNNING THE PROGRAM/////////////////////////////////////////////////////////
    public static void main(String args[]){
        launch(args);

    }
//////////////////////////////////THE METHODS OF KNOWLEDGE//////////////////////////////////


}
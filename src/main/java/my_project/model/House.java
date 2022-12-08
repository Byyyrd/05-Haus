package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class House extends GraphicalObject {
    int width = 100;
    int height = 100;
    int speed = 100;
    public House(int x ,int y,int width,int heigth,int speed){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = heigth;
        this.speed = speed;
    }
    public void draw(DrawTool drawTool){

        //Schornstein
        drawTool.setCurrentColor(new Color(24, 24, 24));
        drawTool.drawFilledRectangle(x+width/8,y-height/2,width/4,height/2);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x+width/8,y-height/2,width/4,height/2);

        // House Base
        drawTool.setCurrentColor(209,188,138,255);
        drawTool.drawFilledRectangle(x,y,width,height);
        drawTool.setCurrentColor(200,0,0,255);
        drawTool.drawFilledTriangle(x,y,x+width,y,x+width/2,y-height/2);

        // Outline
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x,y,width,height);
        drawTool.drawTriangle(x,y,x+width,y,x+width/2,y-height/2);


        //Door
        drawTool.setCurrentColor(new Color(95, 15, 5));
        drawTool.drawFilledRectangle(x+width/2,y+height-height/2.5,width/4,height/2.5);
        drawTool.drawRectangle(x+width/2,y+height-height/2.5,width/4,height/2.5);
        drawTool.setCurrentColor(new Color(255, 192, 0));
        drawTool.drawFilledCircle(x+width/2+width/16,y+height-height/2.5+height/5,width/32);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x+width/2,y+height-height/2.5,width/4,height/2.5);
        drawTool.drawCircle(x+width/2+width/16,y+height-height/2.5+height/5,width/32);


        //Window
        drawTool.setCurrentColor(new Color(75, 75, 78, 232));
        drawTool.drawFilledRectangle(x+width/8,y+height/8,width/4,height/4);
        drawTool.drawFilledRectangle(x+width-width/8 - width/4,y+height/8,width/4,height/4);
        drawTool.setCurrentColor(new Color(255, 255, 255, 255));
        drawTool.drawFilledRectangle(x+width/8,y+2*height/8-(height/64),width/4,height/32);
        drawTool.drawFilledRectangle(x+2*width/8-(width/64),y+height/8,width/32,height/4);

        drawTool.drawFilledRectangle(x+width-width/8 - width/4,y+2*height/8-(height/64),width/4,height/32);
        drawTool.drawFilledRectangle(x+width-width/4-(width/64),y+height/8,width/32,height/4);

        drawTool.setCurrentColor(new Color(255, 255, 255, 255));
        drawTool.drawRectangle(x+width/8,y+height/8,width/4,height/4);
        drawTool.drawRectangle(x+width-width/8 - width/4,y+height/8,width/4,height/4);



    }
    public void update(double dt){

    }
}

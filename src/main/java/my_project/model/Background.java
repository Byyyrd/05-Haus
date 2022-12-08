package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {
    public Background(){

    }
    public void draw(DrawTool drawTool){
        //Himmel
        drawTool.setCurrentColor(new Color(82, 153, 227));
        drawTool.drawFilledRectangle(0,0,600,300);
        //Grass
        drawTool.setCurrentColor(new Color(37, 76, 37));
        drawTool.drawFilledRectangle(0,300,600,300);

    }
    public void update(double dt){

    }
}

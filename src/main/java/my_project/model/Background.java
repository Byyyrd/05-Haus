package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends InteractiveGraphicalObject {
    static double rotation;
    public Background(){

    }
    public void draw(DrawTool drawTool){
        drawTool.getGraphics2D().rotate(rotation,300,300);
        //Himmel
        drawTool.setCurrentColor(new Color(82, 153, 227));
        drawTool.drawFilledRectangle(0,0,600,300);
        //Grass
        drawTool.setCurrentColor(new Color(37, 76, 37));
        drawTool.drawFilledRectangle(0,300,600,300);
        drawTool.getGraphics2D().rotate(0);
    }
    public void update(double dt){
        if(ViewController.isKeyDown(32)) rotation += dt * 2;
    }
}

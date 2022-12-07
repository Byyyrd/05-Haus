package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Fence extends GraphicalObject {
    public Fence(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(75, 44, 0));
        drawTool.drawFilledRectangle(x,y+400,600,10);
        drawTool.drawFilledRectangle(x,y+425,600,10);
        drawTool.setCurrentColor(new Color(92, 54, 0));
        for(int i = 0;i < 12;i++){
            drawTool.drawFilledRectangle(x+(i*50)+10,y+395,5,50);
        }
    }
}

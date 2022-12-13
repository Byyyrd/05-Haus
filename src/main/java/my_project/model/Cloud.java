package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cloud extends GraphicalObject {
    double clouds;
    double rotation;
    public Cloud(int x, int y){
        this.clouds = clouds;
        this.x = x;
        this.y = y;

    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(255,255,255,255);
        drawTool.drawFilledEllipse (x,y,50,40);
        drawTool.drawFilledEllipse (x + 60.25,y,50,40);
    }
    public void update(double dt){
        x += 5;
        if (x>650){
            x = -150;
        }
    }
}

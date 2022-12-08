package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject {
    public Sun(){

    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(Color.yellow);
        drawTool.drawFilledCircle(0,0,100);

    }
    public void update(double dt){

    }
}

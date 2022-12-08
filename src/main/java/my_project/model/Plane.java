package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Plane extends InteractiveGraphicalObject {
    int g;
    double speed;
    public Plane(int x, int y, int scale,double speed) {
        this.x = x;
        this.y = y;
        this.g = scale;
        this.speed = speed;
    }

    public void draw(DrawTool drawTool) {
        //Body//
        drawTool.setCurrentColor(100, 149, 237, 255);
        drawTool.drawFilledEllipse(x, y + g / 4, g - g / 4, g / 4);
        drawTool.setCurrentColor(0, 0, 0, 255);
        drawTool.drawEllipse(x, y + g / 4, g - g / 4, g / 4);
        drawTool.setCurrentColor(255,255,255, 255);
        drawTool.drawFilledArc(x - g/1.34, y-g/2, g*1.5, 90,90, 2);
        drawTool.drawFilledArc(x + g * 2, y - g*1.5, g*2, 270,90 , 2);
        drawTool.drawFilledTriangle(x + g * 3, y - g / 2, x + g * 4, y - g / 2, x + g * 4, y - g * 1.25);
        // Frontwindow//
        drawTool.setCurrentColor(142, 229, 238, 255);
        drawTool.drawFilledArc(x - g / 1.475, y - g/3.9, g / 2, 90, 90, 2);
        drawTool.setCurrentColor(255, 255, 255, 255);
        //drawTool.drawFilledArc(x-g/2.222222222222222222222222,y,g/3.9,Math.PI,Math.PI*2,1);
        drawTool.setCurrentColor(142, 229, 238, 255);
        drawTool.drawFilledRectangle(x - g / 1.818181818181818+1, y - g / 4, g / 1.8, g / 4);
        drawTool.setCurrentColor(255, 255, 255, 255);

        // Body//
        drawTool.setCurrentColor(0, 0, 0, 255);
        drawTool.drawArc(x - g/1.34, y-g/2, g*1.5, 90,90, 2);
        drawTool.drawArc(x + g * 2, y - g*1.5, g*2, 270,90 , 2);
        drawTool.drawPolygon(x + g * 3, y - g / 2, x + g * 4, y - g / 2, x + g * 4, y - g * 1.25);
        drawTool.setCurrentColor(255,255,255, 255);
        drawTool.drawFilledRectangle(x, y - g / 2, g * 3, g);
        drawTool.setCurrentColor(0, 0, 0, 255);
        drawTool.drawRectangle(x, y - g / 2, g * 3, g);
        drawTool.setCurrentColor(100, 149, 237, 255);
        drawTool.drawFilledRectangle(x, y + g / 4, g * 3, g / 4);
        drawTool.setCurrentColor(0, 0, 0, 255);
        drawTool.drawRectangle(x, y + g / 4, g * 3, g / 4);
        // Window//
        for (int i = 1; i < 5; i++) {
            window(x + g / 2.857142857142857 + (i - 1) * g / 1.333333333333333, y - g / 10, g, drawTool);
        }
        // Wing//
        drawTool.setCurrentColor(255,255,255, 255);
        drawTool.drawFilledTriangle(x + g / 2, y + g / 4, x + g * 2, y + g / 4, x + g * 2, y + 2 * g);
        drawTool.drawFilledRectangle(x + g * 2, y + g / 4, g / 2, g * 1.75);
        drawTool.setCurrentColor(0, 0, 0, 255);
        drawTool.drawPolygon(x + g / 2, y + g / 4, x + g * 2, y + g / 4, x + g * 2, y + 2 * g);
        drawTool.drawRectangle(x + g * 2, y + g / 4, g / 2, g * 1.75);

    }

    public void window(double x, double y, double g, DrawTool drawTool) {
        drawTool.setCurrentColor(211, 211, 211, 255);
        drawTool.drawFilledCircle(x, y, g / 4);
        drawTool.setCurrentColor(142, 229, 238, 255);
        drawTool.drawFilledCircle(x, y, g / 5);
        drawTool.setCurrentColor(255, 255, 255, 255);
        drawTool.drawCircle(x, y, g / 4);
        drawTool.drawCircle(x, y, g / 5);
    }


    public void update(double dt) {
        if(ViewController.isKeyDown(87)){//Up
            y -= speed * dt;
        }
        if(ViewController.isKeyDown(83)){//Down
            y += speed * dt;
        }
        if(ViewController.isKeyDown(65)){//Left
            x -= speed * dt;
        }
        if(ViewController.isKeyDown(68)){//Right
            x += speed * dt;
        }
    }
}

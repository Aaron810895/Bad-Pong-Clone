import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{

    int id;
    int yVel;
    int speed =2;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDlE_HEIGHT, int id){
        super(x,y,PADDLE_WIDTH, PADDlE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {

        switch (id){
            case 1:
                if (e.getKeyCode()==KeyEvent.VK_W){
                    setY(-speed);
                    move();
                }
                if (e.getKeyCode()==KeyEvent.VK_S){
                    setY(speed);
                    move();
                }
                break;

            case 2:
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    setY(-speed);
                    move();
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    setY(speed);
                    move();
                }
                break;
        }
    }
    public void keyReleased(KeyEvent e) {

        switch (id){
            case 1:
                if (e.getKeyCode()==KeyEvent.VK_W){
                    setY(0);
                    move();
                }
                if (e.getKeyCode()==KeyEvent.VK_S){
                    setY(0);
                    move();
                }
                break;

            case 2:
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    setY(0);
                    move();
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    setY(0);
                    move();
                }
                break;
        }
    }
    public void setY(int yDirection){
        yVel = yDirection;
    }
    public void move(){
        y= y+yVel;
    }
    public void draw(Graphics g){
        if (id ==1)
            g.setColor(Color.cyan);
        else
            g.setColor(Color.green);
        g.fillRect(x,y,width,height);


    }
}

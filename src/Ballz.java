import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ballz extends Rectangle{

    Random random;
    int xVel;
    int yVel;
    int startSpeed =2;

    Ballz(int x, int y, int width, int height){
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0)
            randomXDirection--;
        setX(randomXDirection*startSpeed);

        int randomYDirection = random.nextInt(2);
        if (randomYDirection ==0)
            randomYDirection--;
        setY(randomYDirection*startSpeed);
    }

    public void setX(int randomXDirection){
        xVel = randomXDirection;
    }
    public void setY(int randomYDirection){
        yVel = randomYDirection;
    }

    public void move(){
        x += xVel;
        y += yVel;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x, y, height, width);
    }
}
